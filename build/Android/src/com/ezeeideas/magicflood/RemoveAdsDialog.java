package com.ezeeideas.magicflood;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.ImageView;
import android.widget.TextView;

public class RemoveAdsDialog extends GameDialogType3
{
	public RemoveAdsDialog(Activity context, String price) 
	{
		super(context);

		setupViews();
		
		postSetupViews();

		TextView titleTV = (TextView) findViewById(R.id.dialog_remove_ads_title_text_id);
		titleTV.setTypeface(MFUtils.getTextTypeface(context));
		
		TextView descriptionTV = (TextView) findViewById(R.id.dialog_remove_ads_description_text_id);
		descriptionTV.setTypeface(MFUtils.getTextTypeface(context));
		
		TextView tv = (TextView) findViewById(R.id.remove_ads_price_text_id);
		String text = String.format(context.getResources().getString(R.string.remove_ads_price_text), price);
		tv.setText(text);
		tv.setTypeface(MFUtils.getTextTypeface(context));
	}

	protected void setupViews() 
	{
		setContentView(R.layout.dialog_remove_ads);
	}

	@Override
	protected void setupRootView() 
	{
		mRootView = findViewById(R.id.game_dialog_root_layout);
	}

	@Override
	protected void setupPositiveAction1View() 
	{
		mPositiveAction1View = findViewById(R.id.remove_ads_button_id);
	}

	@Override
	protected void setupNegativeAction1View() 
	{
		mNegativeAction1View = findViewById(R.id.cancel_button);
	}
	
	public static final int ADD_LIFELINE_TYPE_MOVES = 1;
	public static final int ADD_LIFELINE_TYPE_STARS = 2;
}
