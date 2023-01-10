package com.example.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class Broadcast extends BroadcastReceiver {

    public static final String POWER_CHARGING = "android.intent.action.ACTION_POWER_CONNECTED";
    public static final String POWER_DISCHARGING = "android.intent.action.ACTION_POWER_DISCONNECTED";

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Broadcast.POWER_CHARGING)){
            Toast.makeText(context, "ĐÃ CẮM SẠC", Toast.LENGTH_SHORT).show();
        }
        if (intent.getAction().equals(Broadcast.POWER_DISCHARGING)){
            Toast.makeText(context, "ĐÃ RÚT SẠC", Toast.LENGTH_SHORT).show();
        }

    }
}
