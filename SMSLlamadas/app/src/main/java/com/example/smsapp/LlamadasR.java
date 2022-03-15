package com.example.smsapp;

import android.content.BroadcastReceiver;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class LlamadasR extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String state = extras.getString(TelephonyManager.EXTRA_STATE);
            Log.w("Estado:", state);
            if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
                String phoneNumber = extras
                        .getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
                Log.w("Numero:", phoneNumber);
            }
        }
    }
}
