package com.example.grishma.fragmenttestmore;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by grishma on 2/19/16.
 */
public class FragmentTestMore extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }
}
