package com.example.parktaejun.nowhere;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by parktaejun on 2016. 11. 20..
 */

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_splash);

        Handler hd = new Handler();
        hd.postDelayed(new Runnable() {

            @Override
            public void run() {
                finish();       // 3 초후 이미지를 닫아버림
            }
        }, 3000);
    }


}
