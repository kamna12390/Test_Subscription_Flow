package com.scribble.animation.maker.video.effect.myadslibrary.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.scribble.animation.maker.video.effect.myadslibrary.utils.InternetConnection;

public class NetworkChangeReceiver extends BroadcastReceiver {

    private static final String TAG = "NetworkChangeReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive: net "+InternetConnection.checkConnection(context));
        if(InternetConnection.checkConnection(context)){
            Log.d(TAG, "onReceive: true");
            Intent intent1 = new Intent("com.scribble.animation.maker.video.effect.myadslibrary.custom");
            context.sendBroadcast(intent1);
        }
    }
}
