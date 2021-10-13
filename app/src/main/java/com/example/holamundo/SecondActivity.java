package com.example.holamundo;

import android.app.Activity;
import android.util.Log;

public class SecondActivity {
    private static final String LOG_TAG = SecondActivity.class.getSimpleName();



    protected void onStart() {
        Log.d(LOG_TAG, "STARTING");
    }


    protected void onResume() {
        Log.d(LOG_TAG, "RESUME DONE");
    }


    protected void onRestart() {
        Log.d(LOG_TAG, "RESTARTING...");
    }


    protected void onPause() {
        Log.d(LOG_TAG,"GAME PAUSED");
    }


    protected void onStop() {
        Log.d(LOG_TAG,"GAME STOPED");
    }


    protected void onDestroy() {
        Log.d(LOG_TAG, "DESTROYING...");
    }

    protected void returnReplay(){
        Log.d(LOG_TAG, "End SecondActivity");
    }

    public void finish(int activity) {
    }

}


