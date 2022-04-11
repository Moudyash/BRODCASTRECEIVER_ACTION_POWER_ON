package com.example.sound;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
MyReceiver MR;
IntentFilter intentFilter;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    MR=new MyReceiver();
    intentFilter = new IntentFilter();
    intentFilter.addAction(Intent.ACTION_POWER_DISCONNECTED);
    intentFilter.addAction(Intent.ACTION_POWER_CONNECTED);

    registerReceiver(MR,intentFilter);

    }


}