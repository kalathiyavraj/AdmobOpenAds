package com.example.admobopenadslibrary;

import android.app.Application;

import com.example.vrajadmobopenads.AppOpenManager;
import com.google.android.gms.ads.MobileAds;

public class MainClass extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MobileAds.initialize(this);

        new AppOpenManager(this, "ca-app-pub-3940256099942544/3419835294");
    }
}
