package com.example.bruno.syncbus;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Bruno on 03/12/2017.
 */

public class SharedPrefManager {

    private static final String SHARED_PREF_NAME="fcmsharedprefdemo";
    private static final String KEY_ACESS_TOKEN="token";

    private static Context meuContexto;
    private static SharedPrefManager minhaInstancia;
    private SharedPrefManager(Context context) {
        meuContexto=context;

    }
    public static synchronized SharedPrefManager getMinhaInstancia(Context context){
        if (minhaInstancia==null)
            minhaInstancia= new SharedPrefManager(context);
        return minhaInstancia;
    }

    public boolean storeToken(String token){

        SharedPreferences sharedPreferences = meuContexto.getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString(KEY_ACESS_TOKEN,token);
        editor.apply();
        return true;
    }


    public String getToken(){
        SharedPreferences sharedPreferences = meuContexto.getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE);
        return sharedPreferences.getString(KEY_ACESS_TOKEN, null);
    }
}
