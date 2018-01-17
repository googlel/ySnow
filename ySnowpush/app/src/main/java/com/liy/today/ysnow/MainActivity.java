package com.liy.today.ysnow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.liy.today.ysonw.snowingview.widgets.SnowingView;

public class MainActivity extends AppCompatActivity {

    private SnowingView mSnowingView;

    private Switch mSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mSwitch = (Switch) findViewById(R.id.sw_snowing);
        mSnowingView = (SnowingView) findViewById(R.id.snowing_view);

        mSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    mSnowingView.startFall();  // 开始下雪
                } else {
                    mSnowingView.stopFall(); // 停止下雪
                }
            }
        });
    }
}
