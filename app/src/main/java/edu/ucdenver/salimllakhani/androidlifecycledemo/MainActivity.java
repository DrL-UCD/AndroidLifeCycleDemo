package edu.ucdenver.salimllakhani.androidlifecycledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i ("Info", "My Message onCreate");
        setContentView(R.layout.activity_main);
    }


    public void onStart () {
        super.onStart();
        Log.i ("Info", "My Message onStart");

    }

    public void onPause () {
        super.onPause();
        Log.i ("info", "My Message onPause");
    }
}