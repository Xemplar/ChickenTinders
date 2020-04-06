package com.xemplarsoft.apps.whatever;

import android.util.Base64;

public final class Vars {
    public static native String getAPIKeyPlaces();
    public static String getPlacesApiKey(){
        return new String(Base64.decode(getAPIKeyPlaces(), Base64.DEFAULT));
    }

    static {
        System.loadLibrary("keys");
    }
}
