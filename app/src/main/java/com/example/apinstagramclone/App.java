package com.example.apinstagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("GKCMjahwmukd912f3x7XR0j1Zs7JFL8ZwQoh5Lgx")
                // if defined
                .clientKey("NfQ2n5bhfaQqjVS1sPBOj2nWN7g46vvUedNn5eR3")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
