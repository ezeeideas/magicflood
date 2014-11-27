/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_ezeeideas_magicflood_MFGameActivity */

#ifndef _Included_com_ezeeideas_magicflood_MFGameActivity
#define _Included_com_ezeeideas_magicflood_MFGameActivity
#ifdef __cplusplus
extern "C" {
#endif
#undef com_ezeeideas_magicflood_MFGameActivity_BIND_ABOVE_CLIENT
#define com_ezeeideas_magicflood_MFGameActivity_BIND_ABOVE_CLIENT 8L
#undef com_ezeeideas_magicflood_MFGameActivity_BIND_ADJUST_WITH_ACTIVITY
#define com_ezeeideas_magicflood_MFGameActivity_BIND_ADJUST_WITH_ACTIVITY 128L
#undef com_ezeeideas_magicflood_MFGameActivity_BIND_ALLOW_OOM_MANAGEMENT
#define com_ezeeideas_magicflood_MFGameActivity_BIND_ALLOW_OOM_MANAGEMENT 16L
#undef com_ezeeideas_magicflood_MFGameActivity_BIND_AUTO_CREATE
#define com_ezeeideas_magicflood_MFGameActivity_BIND_AUTO_CREATE 1L
#undef com_ezeeideas_magicflood_MFGameActivity_BIND_DEBUG_UNBIND
#define com_ezeeideas_magicflood_MFGameActivity_BIND_DEBUG_UNBIND 2L
#undef com_ezeeideas_magicflood_MFGameActivity_BIND_IMPORTANT
#define com_ezeeideas_magicflood_MFGameActivity_BIND_IMPORTANT 64L
#undef com_ezeeideas_magicflood_MFGameActivity_BIND_NOT_FOREGROUND
#define com_ezeeideas_magicflood_MFGameActivity_BIND_NOT_FOREGROUND 4L
#undef com_ezeeideas_magicflood_MFGameActivity_BIND_WAIVE_PRIORITY
#define com_ezeeideas_magicflood_MFGameActivity_BIND_WAIVE_PRIORITY 32L
#undef com_ezeeideas_magicflood_MFGameActivity_CONTEXT_IGNORE_SECURITY
#define com_ezeeideas_magicflood_MFGameActivity_CONTEXT_IGNORE_SECURITY 2L
#undef com_ezeeideas_magicflood_MFGameActivity_CONTEXT_INCLUDE_CODE
#define com_ezeeideas_magicflood_MFGameActivity_CONTEXT_INCLUDE_CODE 1L
#undef com_ezeeideas_magicflood_MFGameActivity_CONTEXT_RESTRICTED
#define com_ezeeideas_magicflood_MFGameActivity_CONTEXT_RESTRICTED 4L
#undef com_ezeeideas_magicflood_MFGameActivity_MODE_APPEND
#define com_ezeeideas_magicflood_MFGameActivity_MODE_APPEND 32768L
#undef com_ezeeideas_magicflood_MFGameActivity_MODE_ENABLE_WRITE_AHEAD_LOGGING
#define com_ezeeideas_magicflood_MFGameActivity_MODE_ENABLE_WRITE_AHEAD_LOGGING 8L
#undef com_ezeeideas_magicflood_MFGameActivity_MODE_MULTI_PROCESS
#define com_ezeeideas_magicflood_MFGameActivity_MODE_MULTI_PROCESS 4L
#undef com_ezeeideas_magicflood_MFGameActivity_MODE_PRIVATE
#define com_ezeeideas_magicflood_MFGameActivity_MODE_PRIVATE 0L
#undef com_ezeeideas_magicflood_MFGameActivity_MODE_WORLD_READABLE
#define com_ezeeideas_magicflood_MFGameActivity_MODE_WORLD_READABLE 1L
#undef com_ezeeideas_magicflood_MFGameActivity_MODE_WORLD_WRITEABLE
#define com_ezeeideas_magicflood_MFGameActivity_MODE_WORLD_WRITEABLE 2L
#undef com_ezeeideas_magicflood_MFGameActivity_DEFAULT_KEYS_DIALER
#define com_ezeeideas_magicflood_MFGameActivity_DEFAULT_KEYS_DIALER 1L
#undef com_ezeeideas_magicflood_MFGameActivity_DEFAULT_KEYS_DISABLE
#define com_ezeeideas_magicflood_MFGameActivity_DEFAULT_KEYS_DISABLE 0L
#undef com_ezeeideas_magicflood_MFGameActivity_DEFAULT_KEYS_SEARCH_GLOBAL
#define com_ezeeideas_magicflood_MFGameActivity_DEFAULT_KEYS_SEARCH_GLOBAL 4L
#undef com_ezeeideas_magicflood_MFGameActivity_DEFAULT_KEYS_SEARCH_LOCAL
#define com_ezeeideas_magicflood_MFGameActivity_DEFAULT_KEYS_SEARCH_LOCAL 3L
#undef com_ezeeideas_magicflood_MFGameActivity_DEFAULT_KEYS_SHORTCUT
#define com_ezeeideas_magicflood_MFGameActivity_DEFAULT_KEYS_SHORTCUT 2L
#undef com_ezeeideas_magicflood_MFGameActivity_RESULT_CANCELED
#define com_ezeeideas_magicflood_MFGameActivity_RESULT_CANCELED 0L
#undef com_ezeeideas_magicflood_MFGameActivity_RESULT_FIRST_USER
#define com_ezeeideas_magicflood_MFGameActivity_RESULT_FIRST_USER 1L
#undef com_ezeeideas_magicflood_MFGameActivity_RESULT_OK
#define com_ezeeideas_magicflood_MFGameActivity_RESULT_OK -1L
/*
 * Class:     com_ezeeideas_magicflood_MFGameActivity
 * Method:    createNewGrid
 * Signature: (I)J
 */
JNIEXPORT jlong JNICALL Java_com_ezeeideas_magicflood_MFGameActivity_createNewGrid
  (JNIEnv *, jobject, jint);

/*
 * Class:     com_ezeeideas_magicflood_MFGameActivity
 * Method:    deleteGrid
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_com_ezeeideas_magicflood_MFGameActivity_deleteGrid
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_ezeeideas_magicflood_MFGameActivity
 * Method:    getGridSize
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_com_ezeeideas_magicflood_MFGameActivity_getGridSize
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_ezeeideas_magicflood_MFGameActivity
 * Method:    getStartPos
 * Signature: (J)[I
 */
JNIEXPORT jintArray JNICALL Java_com_ezeeideas_magicflood_MFGameActivity_getStartPos
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_ezeeideas_magicflood_MFGameActivity
 * Method:    getMaxMoves
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_com_ezeeideas_magicflood_MFGameActivity_getMaxMoves
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_ezeeideas_magicflood_MFGameActivity
 * Method:    getCurrMove
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_com_ezeeideas_magicflood_MFGameActivity_getCurrMove
  (JNIEnv *, jobject, jlong);

/*
 * Class:     com_ezeeideas_magicflood_MFGameActivity
 * Method:    playMove
 * Signature: (JI)I
 */
JNIEXPORT jint JNICALL Java_com_ezeeideas_magicflood_MFGameActivity_playMove
  (JNIEnv *, jobject, jlong, jint);

/*
 * Class:     com_ezeeideas_magicflood_MFGameActivity
 * Method:    getGridData
 * Signature: (J)[I
 */
JNIEXPORT jintArray JNICALL Java_com_ezeeideas_magicflood_MFGameActivity_getGridData
  (JNIEnv *, jobject, jlong);

#ifdef __cplusplus
}
#endif
#endif
