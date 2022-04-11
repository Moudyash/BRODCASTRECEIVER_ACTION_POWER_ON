package com.example.sound;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;

public class MyReceiver extends BroadcastReceiver {

    @Override

    public void onReceive(Context context, Intent intent) {
        final MediaPlayer mp = MediaPlayer.create(context, R.raw.a);
        final MediaPlayer m1p = MediaPlayer.create(context, R.raw.thkd);
        final MediaPlayer m2p = MediaPlayer.create(context, R.raw.minion_beatbox);
        switch (intent.getAction()) {
            case Intent.ACTION_POWER_DISCONNECTED:

                if (m2p.isPlaying()){
                    m2p.pause();

                }
                mp.start();

                break;
            case Intent.ACTION_POWER_CONNECTED:

                if (mp.isPlaying()){
                 mp.pause();

                }
                m1p.start();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        m1p.pause();

                    }
                },1000);
             m2p.start();
            break;
        }

    }
}