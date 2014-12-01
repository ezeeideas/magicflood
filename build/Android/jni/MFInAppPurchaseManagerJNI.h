/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_ezeeideas_magicflood_MFInAppPurchaseManager */

#ifndef _Included_com_ezeeideas_magicflood_MFInAppPurchaseManager
#define _Included_com_ezeeideas_magicflood_MFInAppPurchaseManager
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     com_ezeeideas_magicflood_MFInAppPurchaseManager
 * Method:    initializeInAppInterface
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_ezeeideas_magicflood_MFInAppPurchaseManager_initializeInAppInterface
  (JNIEnv *, jobject);

/*
 * Class:     com_ezeeideas_magicflood_MFInAppPurchaseManager
 * Method:    addInAppProduct
 * Signature: (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
 */
JNIEXPORT void JNICALL Java_com_ezeeideas_magicflood_MFInAppPurchaseManager_addInAppProduct
  (JNIEnv *, jobject, jstring, jstring, jstring, jstring, jstring, jboolean);

/*
 * Class:     com_ezeeideas_magicflood_MFInAppPurchaseManager
 * Method:    updateInAppProduct
 * Signature: (Ljava/lang/String;Z)V
 */
JNIEXPORT void JNICALL Java_com_ezeeideas_magicflood_MFInAppPurchaseManager_updateInAppProduct
  (JNIEnv *, jobject, jstring, jboolean);

/*
 * Class:     com_ezeeideas_magicflood_MFInAppPurchaseManager
 * Method:    clearInAppProducts
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_com_ezeeideas_magicflood_MFInAppPurchaseManager_clearInAppProducts
  (JNIEnv *, jobject);

/*
 * Class:     com_ezeeideas_magicflood_MFInAppPurchaseManager
 * Method:    getProductDetails
 * Signature: (Ljava/lang/String;)[Ljava/lang/String;
 */
JNIEXPORT jobjectArray JNICALL Java_com_ezeeideas_magicflood_MFInAppPurchaseManager_getProductDetails
  (JNIEnv *, jobject, jstring);

/*
 * Class:     com_ezeeideas_magicflood_MFInAppPurchaseManager
 * Method:    getProductProvisioned
 * Signature: (Ljava/lang/String;)Z
 */
JNIEXPORT jboolean JNICALL Java_com_ezeeideas_magicflood_MFInAppPurchaseManager_getProductProvisioned
  (JNIEnv *, jobject, jstring);

#ifdef __cplusplus
}
#endif
#endif
