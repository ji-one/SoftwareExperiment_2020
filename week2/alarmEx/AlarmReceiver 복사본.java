package com.example.alarmex;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String tag = intent.getStringExtra("tag");
        Toast.makeText(context,tag+ " Alarararararm",Toast.LENGTH_LONG).show();
    }
}
