package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Broadcast broadcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        broadcast = new Broadcast();
        IntentFilter filter1 = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
        registerReceiver(broadcast, filter1);

        IntentFilter filter2 = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
        registerReceiver(broadcast, filter2);

    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(broadcast);
    }
}