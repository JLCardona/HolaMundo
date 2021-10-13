package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity();
            }
        });

        //Log.i("Houston","We've a problem.");
        //Log.d("TAG 1 ", "Houston");
        //Log.d("TAG 2 ", "We've a Problem");
    }
    public void startActivity(){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, 1);
    }

/*
    @Override
    protected void onStart() {
        super.onStart();
        //Log.e("ERROR 333 : ","START FAILED");
        Log.d("Sarting...", "Successful");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("DEBUGGING RESUME... ", "ALL DONE");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("WARNING : ", "RESTARTING...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("IMPORTANT : ","GAME PAUSED");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("UPS... ","EVENT FAILED");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("WATCH OUT : ", "DESTROYING...");
    }*/
}