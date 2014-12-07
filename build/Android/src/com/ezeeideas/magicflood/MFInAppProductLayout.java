package com.ezeeideas.magicflood;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MFInAppProductLayout extends LinearLayout
{
	public MFInAppProductLayout(Context context) 
	{
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	public MFInAppProductLayout(Context context, AttributeSet attrs)
	{
		super(context, attrs);
	}
	
	public void setProperties(String title, String price, boolean isProvisioned)
	{
		TextView tvDetail = (TextView) findViewById(R.id.textview_iap_detail_id);
		tvDetail.setText(title);
		
		TextView tvPrice = (TextView) findViewById(R.id.textview_price_id);
		tvPrice.setText(price);
		
		ImageView imageView = (ImageView) findViewById(R.id.image_iap_status_id);
		if (isProvisioned)
		{	
			imageView.setBackgroundResource(R.drawable.ic_iap_tick);
		}
		else
		{
			imageView.setBackgroundResource(R.drawable.ic_iap_lock);
		}
	}
}