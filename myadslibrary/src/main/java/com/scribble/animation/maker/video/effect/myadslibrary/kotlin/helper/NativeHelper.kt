package com.scribble.animation.maker.video.effect.myadslibrary.kotlin.helper

class NativeHelper {

    companion object{
        init {
            System.loadLibrary("advance-native-lib");
        }
    }

    external fun getBaseUrl() : String

    external fun getZipUrl() : String

    external fun getAppBaseUrl() : String

}