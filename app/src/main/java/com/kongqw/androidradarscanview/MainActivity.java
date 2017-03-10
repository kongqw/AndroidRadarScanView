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
//        radarScanView
//                // 设置雷达扫描一圈时间
//                .setRadarScanTime(2000)
//                // 设置雷达背景颜色
//                .setRadarBackgroundColor(Color.WHITE)
//                // 设置雷达背景圆圈数
//                .setRadarBackgroundLinesNumber(4)
//                // 设置底盘圆圈宽度
//                .setRadarBackgroundLinesWidth(2)
//                // 设置雷达圆圈颜色
//                .setRadarBackgroundLinesColor(Color.GRAY)
//                // 设置雷达扫描颜色
//                .setRadarScanColor(0xFFAAAAAA)
//                // 设置雷达扫描透明度
//                .setRadarScanAlpha(0xAA);
    }

    @Override
    protected void onResume() {
        super.onResume();
        // radarScanView.startScan();
    }

    public void startScan(View view) {
        radarScanView.startScan();
    }

    public void stopScan(View view) {
        radarScanView.stopScan();
    }
}
