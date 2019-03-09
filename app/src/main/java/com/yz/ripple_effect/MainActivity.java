package com.yz.ripple_effect;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.skyfishjy.library.RippleBackground;

public class MainActivity extends AppCompatActivity {

    private RippleBackground rbg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        rbg.startRippleAnimation();
    }

    private void initView() {
        rbg = (RippleBackground) findViewById(R.id.rbg);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        rbg.stopRippleAnimation();
    }
}
