package com.danielkim.soundrecorder;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by sylvain on 02/01/2017.
 */
public class Serializer {
    private static final String LOG_TAG = "Serializer";

    private static Gson gson = new Gson();

    public static String serialize(ArrayList inputArray){
        String ret = gson.toJson(inputArray);
        Log.d(LOG_TAG, "serialize:" +ret);
        return ret;
    }

    public static ArrayList derialize(String outputarray){
        Type type = new TypeToken<ArrayList<Long>>() {}.getType();
        Log.d(LOG_TAG, "derialize:" +outputarray);
        return gson.fromJson(outputarray, type);
    }

}
