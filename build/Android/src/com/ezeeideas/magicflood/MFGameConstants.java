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
	
	
	/* Android specific constants */
	/**
	 * Keys
	 */
	public static final String GAME_LEVEL_KEY = "level";
	
	/**
	 * Names
	 */
	public static final String NATIVE_LIBRARY_NAME = "magicflood";
}
