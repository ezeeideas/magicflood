package com.ezeeideas.magicflood;

import java.util.ArrayList;

import org.json.JSONException;
import org.json.JSONObject;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import com.android.vending.billing.IInAppBillingService;

public class MFInAppPurchaseManager implements ServiceConnection
{
	public MFInAppPurchaseManager()
	{
		
	}
	
	public static MFInAppPurchaseManager create()
	{
		if (sIAPManager == null)
		{
			sIAPManager = new MFInAppPurchaseManager();
		}
		
		return sIAPManager;
		/*
		sIAPManager.initializeInAppInterface();
		
		sIAPManager.addInAppProduct(MFGameConstants.IAP_ALACARTE_1, "First A-la-carte Item", "My very first IAP", true);
		sIAPManager.addInAppProduct(MFGameConstants.IAP_ALACARTE_2, "Second A-la-carte item", "My very second IAP", false);
		sIAPManager.addInAppProduct(MFGameConstants.IAP_ALACARTE_3, "Third A-la-carte item", "My very third IAP", false);
		sIAPManager.addInAppProduct(MFGameConstants.IAP_ALACARTE_4, "Fourth A-la-carte item", "My very fourth IAP", false);
		sIAPManager.addInAppProduct(MFGameConstants.IAP_ALACARTE_5, "Fifth A-la-carte item", "My very fifth IAP", false);
		sIAPManager.addInAppProduct(MFGameConstants.IAP_ALACARTE_6, "Sixth A-la-carte item", "My very sixth IAP", false);
		sIAPManager.addInAppProduct(MFGameConstants.IAP_COMBO_1, "Combo: 5 Hurdles!", "My very seventh IAP", false);
		sIAPManager.addInAppProduct(MFGameConstants.IAP_COMBO_2, "Combo: 10 Hurdles!", "My very eighth IAP", false);
		sIAPManager.addInAppProduct(MFGameConstants.IAP_COMBO_3, "Combo: 25 Hurdles!", "My very ninth IAP", false);
		sIAPManager.addInAppProduct(MFGameConstants.IAP_COMBO_4, "Combo: 50 Hurdles!", "My very tenth IAP", false);
		*/
	}
	
	@Override
	public void onServiceConnected(ComponentName arg0, IBinder service) 
	{
		mService = IInAppBillingService.Stub.asInterface(service);
		Log.d("magicflood", "onServiceConnected called, mService = " + mService);
		queryInAppItems();
	}

	@Override
	public void onServiceDisconnected(ComponentName arg0) 
	{
		mService = null;		
	}
	
	public boolean isServiceConnected()
	{
		return (mService != null);
	}
	
	/**
	 * Query the service for available in-app purchase items.  This should
	 * be done in a separate thread given that it's a network request.
	 */
	public void queryInAppItems()
	{
		Log.d("magicflood", "queryInAppItems, mService = " + mService);
		mQuerySkuDetailsTask = new QuerySKUDetailsTask();
		mQuerySkuDetailsTask.execute(0);
	}
	
	private class QuerySKUDetailsTask extends AsyncTask<Integer, Integer, Boolean>
	{
		protected Boolean doInBackground(Integer... args)
		{
			Log.d("magicflood", "doInBackground...");
			ArrayList<String> skuList = new ArrayList<String> ();
			
			String testPrefix = "";
			if (MFGameConstants.testingMode)
			{
				testPrefix += "test_";
			}
			skuList.add(testPrefix + MFGameConstants.IAP_ALACARTE_HURDLE_1);
			skuList.add(testPrefix + MFGameConstants.IAP_ALACARTE_HURDLE_2);
			skuList.add(testPrefix + MFGameConstants.IAP_ALACARTE_HURDLE_3);
			skuList.add(testPrefix + MFGameConstants.IAP_ALACARTE_HURDLE_4);
			skuList.add(testPrefix + MFGameConstants.IAP_ALACARTE_HURDLE_5);
			//skuList.add(testPrefix + MFGameConstants.IAP_ALACARTE_HURDLE_6);
			//skuList.add(testPrefix + MFGameConstants.IAP_COMBO_HURDLES_1);
			//skuList.add(testPrefix + MFGameConstants.IAP_COMBO_HURDLES_2);
			//skuList.add(testPrefix + MFGameConstants.IAP_COMBO_HURDLES_3);
			//skuList.add(testPrefix + MFGameConstants.IAP_COMBO_HURDLES_4);
			//skuList.add(testPrefix + MFGameConstants.IAP_REMOVE_ADS);
			
			Bundle querySkus = new Bundle();
			querySkus.putStringArrayList(MFGameConstants.IAP_QUERY_SKUS_KEY, skuList);
			
			try {
				mSkuDetails = mService.getSkuDetails(3, MFGameConstants.PACKAGE_NAME, "inapp", querySkus);
			} catch (RemoteException e) {
				return false;
			}
			int response = mSkuDetails.getInt(MFGameConstants.IAP_RESPONSE_CODE_KEY);
			if (response == MFGameConstants.BILLING_RESPONSE_RESULT_OK)
			{
				Log.d("magicflood", "called getSkuDetails, and it was successful");
				return true;
			}
			
			Log.d("magicflood", "called getSkuDetails, and something failed, response = " + response);
			return false;
		}
		protected void onProgressUpdate(Integer... args)
		{
			
		}
		
		/**
		 * If the query of sku details from the server was successful, extract the
		 * relevant information and data and update that in the local cache in the C++ code.
		 */
		protected void onPostExecute(Boolean result)
		{
			if (result == true) //the background task was successful
			{
				Log.d("magicflood", "onPostExecute...");
				//extract details
				ArrayList<String> responseList = mSkuDetails.getStringArrayList(MFGameConstants.IAP_QUERY_DETAILS_KEY);
			
				//add the in-app products
				for (String thisResponse : responseList) 
				{
					JSONObject object;
					try 
					{
						//extract details of this SKU
						object = new JSONObject(thisResponse);
						String pid = object.getString(MFGameConstants.IAP_PRODUCT_ID);
						String price = object.getString(MFGameConstants.IAP_PRODUCT_PRICE);
						String name = object.getString(MFGameConstants.IAP_PRODUCT_TITLE);
						String description = object.getString(MFGameConstants.IAP_PRODUCT_DESCRIPTION);
						String currencyCode = object.getString(MFGameConstants.IAP_PRODUCT_PRICE_CURRENCY_CODE);
						
						//Add this product to the list in the C++ side.  Setting purchase/provisioning status as false
						//by default - this is updated after invoking the second API (below)
						Log.d("magicflood", "calling addInAppProduct with pid = [" + pid + "], name = [" + name + "], description = [" + 
									description + "], price = [" + price + "], currencyCode = [" + currencyCode);
						addInAppProduct(pid, name, description, price, currencyCode, false);
					} catch (JSONException e) 
					{
						//something went wrong, so we can't claim we're done synchronizing the iap status
						clearInAppProducts(); //clear the in-app products cache
						
						mIsSynchronizedWithServer = false;
					}
				}
				
				//now update the provisioning status
				Bundle ownedItems = null;
				try 
				{
					ownedItems = mService.getPurchases(3, MFGameConstants.PACKAGE_NAME, "inapp", null);
					Log.d("magicflood", "called getPurchases");
				} catch (RemoteException e1) 
				{
					//something went wrong, so we can't claim we're done synchronizing the iap status
					clearInAppProducts();
					
					mIsSynchronizedWithServer = false;
					Log.d("magicflood", "something went wrong 1");
				}
				
				int response = ownedItems.getInt(MFGameConstants.IAP_RESPONSE_CODE_KEY);
				if (response == MFGameConstants.BILLING_RESPONSE_RESULT_OK) 
				{
				   ArrayList<String>  purchaseDataList = ownedItems.getStringArrayList(MFGameConstants.IAP_PURCHASE_DATA_KEY);
				    
				   for (int i = 0; i < purchaseDataList.size(); ++i) 
				   {
				      String purchaseData = purchaseDataList.get(i);
				  
				      JSONObject object;
				      try 
				      {
				    	  object = new JSONObject(purchaseData);
				    	  
				    	  //extract the purchase status and update the native code with status
				    	  String pid = object.getString(MFGameConstants.IAP_PRODUCT_ID);
				    	  String purchaseState = object.getString(MFGameConstants.IAP_PURCHASE_STATE);
				    	  
				    	  boolean provisioned = false;
				    	  if (Integer.getInteger(purchaseState) == 0)
				    	  {
				    		  //purchased!
				    		  provisioned = true;
				    	  }

				    	  //update the provisioning status in the C++ code
				    	  updateInAppProduct(pid, provisioned);
				      } catch (JSONException e) 
				      {
				    	  //something went wrong, so we can't claim we're done synchronizing the iap status
				    	  
				    	  clearInAppProducts();
				    	  
				    	  mIsSynchronizedWithServer = false;
				    	  
				    	  Log.d("magicflood", "something went wrong 2");
				      }
				   } 
				}
				
				//we're now synchronized the iap status in the C++ code
				mIsSynchronizedWithServer = true;
				
				Log.d("magicflood", "at the end of onPostExecute, everything went well");
			}
		}
	}
	
	private static MFInAppPurchaseManager sIAPManager = null;
	private boolean mIsSynchronizedWithServer = false;
	private Bundle mSkuDetails; //details of the SKU
	private QuerySKUDetailsTask mQuerySkuDetailsTask;
	
	private IInAppBillingService mService;
	
	private native void initializeInAppInterface();
	private native void addInAppProduct(String id, String name, String description, String price, String priceCode, boolean isProvisioned);
	private native void updateInAppProduct(String id, boolean isProvisioned);
	private native void clearInAppProducts();
	public native String[] getProductDetails(String id);
	public native boolean getProductProvisioned(String id);
};