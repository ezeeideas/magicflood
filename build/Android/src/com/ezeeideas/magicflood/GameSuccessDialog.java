package com.ezeeideas.magicflood;

import android.content.Context;

public class GameSuccessDialog extends GameDialogType3 {

	public GameSuccessDialog(Context context) 
	{
		super(context);
		
		setupViews();
		
		postSetupViews();
	}

	protected void setupViews() 
	{
		setContentView(R.layout.dialog_game_success);
	}

	@Override
	protected void setupRootView() 
	{
		mRootView = findViewById(R.id.game_dialog_root_layout);
	}

	@Override
	protected void setupPositiveAction1View() 
	{
		mPositiveAction1View = findViewById(R.id.new_game_button);
	}

	@Override
	protected void setupNegativeAction1View() 
	{
		mNegativeAction1View = findViewById(R.id.menu_button);

	}
}
