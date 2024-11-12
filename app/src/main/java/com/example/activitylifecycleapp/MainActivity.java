package com.example.activitylifecycleapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private TextView lifecycleTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lifecycleTextView = findViewById(R.id.lifecycleTextView);
        logAndAppend("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        logAndAppend("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        logAndAppend("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        logAndAppend("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        logAndAppend("onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        logAndAppend("onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logAndAppend("onDestroy");
    }

    private void logAndAppend(String lifecycleEvent) {
        Log.d(TAG, lifecycleEvent);
        lifecycleTextView.append(lifecycleEvent + "\n");
    }
}
