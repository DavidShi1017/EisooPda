package com.eisoo.pda;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import com.honeywell.aidc.AidcManager;
import com.honeywell.aidc.BarcodeReader;
public class LoginActivity extends AppCompatActivity {

    private static BarcodeReader barcodeReader;
    private AidcManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        AidcManager.create(this, new AidcManager.CreatedCallback() {

            @Override
            public void onCreated(AidcManager aidcManager) {
                manager = aidcManager;
                barcodeReader = manager.createBarcodeReader();
            }
        });
    }

}
