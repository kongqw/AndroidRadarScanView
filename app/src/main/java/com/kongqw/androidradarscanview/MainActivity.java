package com.kongqw.androidradarscanview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kongqw.radarscanviewlibrary.RadarScanView;

public class MainActivity extends AppCompatActivity {

    private RadarScanView radarScanView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radarScanView = (RadarScanView) findViewById(R.id.radarScanView);
        radarScanView.setRadarScanTime(2000)
                .setRadarBackgroundColor(Color.WHITE)
                .setRadarBackgroundLinesNumber(4)
                .setRadarBackgroundLinesWidth(2)
                .setRadarBackgroundLinesColor(Color.GRAY)
                .setRadarScanColor(0xFFAAAAAA)
                .setRadarScanAlpha(0xAA);
    }

    public void startScan(View view) {
        radarScanView.startScan();
    }

    public void stopScan(View view) {
        radarScanView.stopScan();
    }
}
