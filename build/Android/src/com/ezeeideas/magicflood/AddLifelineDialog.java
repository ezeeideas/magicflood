package com.ezeeideas.magicflood;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

public class AddLifelineDialog extends GameDialogType3 {

	public AddLifelineDialog(Context context, int type) 
	{
		super(context);
		
		setupViews();
		
		postSetupViews();
		
		
		if (type == ADD_LIFELINE_TYPE_MOVES)
		{
			AddLifelineProductLayout layout = (AddLifelineProductLayout) mPositiveAction1View;
			layout.setProperties(MFGameConstants.COINS_TO_ADD_5_MOVES, R.drawable.ic_iap_coins_second);
			
			ImageView iv = (ImageView) findViewById(R.id.dialog_add_lifeline_main_image_id);
			iv.setBackgroundResource(R.drawable.ic_iap_combo_1);
			
			TextView tvTitle = (TextView) findViewById(R.id.dialog_add_lifeline_title_text_id);
			tvTitle.setText(context.getResources().getString(R.string.dialog_add_lifeline_moves_title_text));
			
			TextView tvDescription = (TextView) findViewById(R.id.dialog_add_lifeline_description_text_id);
			tvDescription.setText(context.getResources().getString(R.string.dialog_add_lifeline_moves_description_text));
		}
		else if (type == ADD_LIFELINE_TYPE_STARS)
		{
			AddLifelineProductLayout layout = (AddLifelineProductLayout) mPositiveAction1View;
			layout.setProperties(MFGameConstants.COINS_TO_ADD_A_STAR, R.drawable.ic_iap_coins_second);
			
			ImageView iv = (ImageView) findViewById(R.id.dialog_add_lifeline_main_image_id);
			iv.setBackgroundResource(R.drawable.ic_iap_combo_1);
			
			TextView tvTitle = (TextView) findViewById(R.id.dialog_add_lifeline_title_text_id);
			tvTitle.setText(context.getResources().getString(R.string.dialog_add_lifeline_stars_title_text));
			
			TextView tvDescription = (TextView) findViewById(R.id.dialog_add_lifeline_description_text_id);
			tvDescription.setText(context.getResources().getString(R.string.dialog_add_lifeline_stars_description_text));
		}
		
	}

	protected void setupViews() 
	{
		setContentView(R.layout.dialog_add_lifeline);
	}

	@Override
	protected void setupRootView() 
	{
		mRootView = findViewById(R.id.game_dialog_root_layout);
	}

	@Override
	protected void setupPositiveAction1View() 
	{
		mPositiveAction1View = findViewById(R.id.add_lifeline_button_id);
	}

	@Override
	protected void setupNegativeAction1View() 
	{
		mNegativeAction1View = findViewById(R.id.cancel_button);
	}
	
	public static final int ADD_LIFELINE_TYPE_MOVES = 1;
	public static final int ADD_LIFELINE_TYPE_STARS = 2;
	
}
