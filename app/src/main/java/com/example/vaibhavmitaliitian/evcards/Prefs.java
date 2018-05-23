package com.example.vaibhavmitaliitian.evcards;

import android.content.Context;
import android.preference.PreferenceManager;

public class Prefs {
    // access the shared preferences using this class
    public static String prefs(String id,Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(id,"Default") ;
    }
    public static void updatePrefs(String id,String val,Context context) {
         PreferenceManager.getDefaultSharedPreferences(context).edit().putString(id,"Default").apply() ;
    }
}
