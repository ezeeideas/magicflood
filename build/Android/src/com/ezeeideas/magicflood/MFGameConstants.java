package com.ezeeideas.magicflood;

/**
 * Note: All constants in this class must match the constants in MFGridInterface.h
 * It needs to be in sync with MFGridInterface.h at all times
 * 
 * @author anukrity
 *
 */
public class MFGameConstants 
{
	/**
	 * Game Levels
	 */
	public static final int GAME_LEVEL_EASY = 0;
	public static final int GAME_LEVEL_MEDIUM = 1;
	public static final int GAME_LEVEL_HARD = 2;
	
	/**
	 * Results of a Move
	 */
	public static final int RESULT_CONTINUE = 0;
	public static final int RESULT_SUCCESS = 1;
	public static final int RESULT_FAILED = 2;
	
	/**
	 * Color values stored in the Grid
	 */
	public static final int GRID_OBSTACLE = -1;
	
	public static final int GRID_COLOR_RED = 1;
	public static final int GRID_COLOR_GREEN = 2;
	public static final int GRID_COLOR_BLUE = 3;
	public static final int GRID_COLOR_YELLOW = 4;
	public static final int GRID_COLOR_ORANGE = 5;
	public static final int GRID_COLOR_CYAN = 6;
	
	public static final int GRID_NUM_COLORS = 6;
	
	/**
	 * In-App Purchase Product IDs
	 */
	public static final int IAP_ALACARTE_1 = 1;
	public static final int IAP_ALACARTE_2 = 2;
	public static final int IAP_ALACARTE_3 = 3;
	public static final int IAP_ALACARTE_4 = 4;
	public static final int IAP_ALACARTE_5 = 5;
	public static final int IAP_ALACARTE_6 = 6;
	public static final int IAP_COMBO_1 = 7;
	public static final int IAP_COMBO_2 = 8;
	public static final int IAP_COMBO_3 = 9;
	public static final int IAP_COMBO_4 = 10;
	//public static final int IAP_REMOVE_ADS = 11;
	
	/**
	 * In-App Purchase Product String IDs.
	 */
	public static final String IAP_ALACARTE_HURDLE_1 = "iap_alacarte_hurdle_1";
	public static final String IAP_ALACARTE_HURDLE_2 = "iap_alacarte_hurdle_2";
	public static final String IAP_ALACARTE_HURDLE_3 = "iap_alacarte_hurdle_3";
	public static final String IAP_ALACARTE_HURDLE_4 = "iap_alacarte_hurdle_4";
	public static final String IAP_ALACARTE_HURDLE_5 = "iap_alacarte_hurdle_5";
	public static final String IAP_ALACARTE_HURDLE_6 = "iap_alacarte_hurdle_6";
	public static final String IAP_COMBO_HURDLES_1 = "iap_combo_hurdles_1";
	public static final String IAP_COMBO_HURDLES_2 = "iap_combo_hurdles_2";
	public static final String IAP_COMBO_HURDLES_3 = "iap_combo_hurdles_3";
	public static final String IAP_COMBO_HURDLES_4 = "iap_combo_hurdles_4";
	public static final String IAP_REMOVE_ADS = "iap_remove_ads";
	
	public static final String IAP_QUERY_SKUS_KEY = "iap_query_skus_key"; //key used to query the skus from the bundle
	
    // Billing response codes
    public static final int BILLING_RESPONSE_RESULT_OK = 0;
    public static final int BILLING_RESPONSE_RESULT_USER_CANCELED = 1;
    public static final int BILLING_RESPONSE_RESULT_BILLING_UNAVAILABLE = 3;
    public static final int BILLING_RESPONSE_RESULT_ITEM_UNAVAILABLE = 4;
    public static final int BILLING_RESPONSE_RESULT_DEVELOPER_ERROR = 5;
    public static final int BILLING_RESPONSE_RESULT_ERROR = 6;
    public static final int BILLING_RESPONSE_RESULT_ITEM_ALREADY_OWNED = 7;
    public static final int BILLING_RESPONSE_RESULT_ITEM_NOT_OWNED = 8;
    
    // SKU Keys
    public static final String IAP_PRODUCT_ID = "productId";
    public static final String IAP_PRODUCT_TYPE = "type";
    public static final String IAP_PRODUCT_PRICE = "price";
    public static final String IAP_PRODUCT_PRICE_CURRENCY_CODE = "price_currency_code"; // refer http://en.wikipedia.org/wiki/ISO_4217#Active_codes
    public static final String IAP_PRODUCT_TITLE = "title";
    public static final String IAP_PRODUCT_DESCRIPTION = "description";
    
    public static final String IAP_PURCHASE_STATE = "purchaseState";
    
	/* Android specific constants */
	/**
	 * Keys
	 */
	public static final String GAME_LEVEL_KEY = "level";
	
	/**
	 * Names
	 */
	public static final String NATIVE_LIBRARY_NAME = "magicflood";
	
	/**
	 * Package name
	 */
	public static String PACKAGE_NAME;
	
	
}
