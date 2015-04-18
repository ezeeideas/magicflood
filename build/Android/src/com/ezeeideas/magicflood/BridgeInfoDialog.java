package com.ezeeideas.magicflood;

import android.content.Context;
import android.widget.TextView;

public class BridgeInfoDialog extends GameDialogType1 {

	public BridgeInfoDialog(Context context, int clientdata) 
	{
		super(context, clientdata);
		
		setupViews();
		
		postSetupViews();
		
		TextView titleTV = (TextView) findViewById(R.id.dialog_bridge_info_title_text_id);
		titleTV.setTypeface(MFUtils.getTextTypeface(context));
		
		TextView descriptionTV = (TextView) findViewById(R.id.dialog_bridge_info_description_text_id);
		descriptionTV.setTypeface(MFUtils.getTextTypeface(context));
		
		TextView positiveButtonTV = (TextView) findViewById(R.id.dialog_introduce_lifeline_positive_button_id);
		positiveButtonTV.setTypeface(MFUtils.getTextTypeface(context));
	}

	protected void setupViews() 
	{
		setContentView(R.layout.dialog_bridge_info);
	}

	@Override
	protected void setupRootView() 
	{
		mRootView = findViewById(R.id.game_dialog_root_layout);
	}

	@Override
	protected void setupNegativeAction1View() 
	{
		mNegativeAction1View = findViewById(R.id.cancel_button);
	}
}
