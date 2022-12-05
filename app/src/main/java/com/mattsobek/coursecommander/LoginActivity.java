package com.mattsobek.coursecommander;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.IOException;
import java.security.GeneralSecurityException;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        try {
            if (LoginUtility.isUserPinSet(getApplicationContext())) {
                // TODO - ask user to login
                int userPin = 123456;
                if (LoginUtility.verifyUserPin(getApplicationContext(), userPin)) {
                    // TODO - user moves to menu
                } else {
                    // TODO - invalid credentials toast
                }
            } else {
                // TODO - ask user to set pin
                int userPin = 123456;
                LoginUtility.storeUserPin(getApplicationContext(), userPin);
            }
        } catch (GeneralSecurityException | IOException e) {
            // TODO - something went wrong toast
            e.printStackTrace();
        }
    }
}