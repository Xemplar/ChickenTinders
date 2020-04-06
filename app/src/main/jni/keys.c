#include <jni.h>

JNIEXPORT jstring JNICALL
Java_com_xemplarsoft_apps_whatever_Vars_getAPIKeyPlaces(JNIEnv *env, jobject instance) {

 return (*env)->  NewStringUTF(env, "");
}