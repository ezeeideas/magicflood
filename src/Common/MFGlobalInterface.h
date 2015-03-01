//
//  MFGlobalInterface.h
//  Magic Flood
//
//  Created by Anukrity Jain on 31/1/15.
//  Copyright (c) 2015 EzeeIdeas. All rights reserved.
//

#ifndef __Magic_Flood__MFGlobalInterface__
#define __Magic_Flood__MFGlobalInterface__


/**
 * Game Constants
 */

extern "C" {
    void setCoins(int coins);
    int getCoins();
    int getNumCoinsIAPFirst();
    int getNumCoinsIAPSecond();
    int getNumCoinsIAPThird();
    int getNumCoinsIAPFourth();
    int getNumCoinsForMoves();
    int getNumCoinsForStar();
    int getNumCoinsForHurdleSmasher();
    int getMinLevelToAddStars();
    int getMinLevelToAddHurdleSmasher();
    int getMinLevelToAddBridge();
    int getNumCoinsForSuccessfulGame(int currMove, int maxMoves);
}


#define FREQUENCY_OF_PROMPTING_USER_TO_STORE 1
#define MOVES_ADD_INCREMENT 5

#define COINS_EARNED_FACTOR_ON_GAME_COMPLETION 20
#define COINS_EARNED_FACTOR_ON_EACH_MOVE 1
#define COINS_EARNED_FACTOR_ON_REMAINING_MOVES 5
#define LEVEL_INTERVAL_REQUIRING_COIN_REDEMPTION 5 //interval between levels after which you must redeem coins to move forward
#define MIN_LEVEL_TO_ADD_STARS 27
#define MIN_LEVEL_TO_ADD_HURDLE_SMASHER 48
#define MIN_LEVEL_TO_ADD_BRIDGE 81



/**
 * Redeeming Coins for Lifelines
 */
#define COINS_TO_ADD_5_MOVES 500
#define COINS_TO_ADD_A_STAR 1000
#define COINS_TO_ADD_A_HURDLE_SMASHER 1500

/**
 General
 **/
#define NUM_LEVELS_PER_SCREEN 16

#endif /* defined(__Magic_Flood__MFGlobalInterface__) */
