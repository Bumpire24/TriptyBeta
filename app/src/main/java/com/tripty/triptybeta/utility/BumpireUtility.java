package com.tripty.triptybeta.utility;

import android.util.Log;

/**
 * Created by miguelfontamillas on 18/08/2017.
 */

public class BumpireUtility {
    private static String BumTAGLog = "Bumpire Log";

    public static void BumLogE(Object className, String message) {
        Log.e(BumTAGLog, "Class Name : " + className.getClass().toString() + ", Message : " + message);
    }

    public static void BumLogD(Object className, String message) {
        Log.d(BumTAGLog, "Class Name : " + className.getClass().toString() + ", Message : " + message);
    }

    public static void BumLogD(Object className, String message, Error e) {
        Log.d(BumTAGLog, "Class Name : " + className.getClass().toString() + ", Message : " + message + ", Error Message : " + e.getMessage());
    }
}
