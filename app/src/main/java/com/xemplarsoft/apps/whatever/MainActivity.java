package com.xemplarsoft.apps.whatever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            Signature[] sigs = this.getPackageManager().getPackageInfo(this.getPackageName(), PackageManager.GET_SIGNATURES).signatures;
            for (Signature sig : sigs) {
                Log.d("Whatever", "Signature hashcode : " + sig.hashCode());
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        Log.d("Whatever", "Key : " + Vars.getPlacesApiKey());
    }
}
