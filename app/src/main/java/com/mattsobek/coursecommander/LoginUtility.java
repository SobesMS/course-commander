package com.mattsobek.coursecommander;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;

import java.io.IOException;
import java.security.GeneralSecurityException;

public final class LoginUtility {
    private static final String FILENAME = "login_prefs";
    private static final String KEY = "pin_code";

    private LoginUtility() {
    }

    private static SharedPreferences decryptSharedPreferences(Context context)
            throws GeneralSecurityException, IOException {
        MasterKey masterKey = new MasterKey.Builder(context)
                .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
                .build();

        return EncryptedSharedPreferences.create(context, FILENAME,
                masterKey, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
                EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
    }

    public static boolean isUserPinSet(Context context) throws GeneralSecurityException, IOException {
        SharedPreferences sharedPreferences = decryptSharedPreferences(context);
        return sharedPreferences.contains(KEY);
    }

    public static void storeUserPin(Context context, int userPin)
            throws GeneralSecurityException, IOException {
        SharedPreferences sharedPreferences = decryptSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(KEY, userPin).apply();
    }

    public static boolean verifyUserPin(Context context, int userPin)
            throws GeneralSecurityException, IOException {
        SharedPreferences sharedPreferences = decryptSharedPreferences(context);

        if (!sharedPreferences.contains(KEY)) {
            return false;
        } else {
            return userPin == sharedPreferences.getInt(KEY, -1);
        }
    }

    public static void deleteUserPin(Context context, int userPin)
            throws GeneralSecurityException, IOException {
        SharedPreferences sharedPreferences = decryptSharedPreferences(context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(KEY).apply();
    }
}
