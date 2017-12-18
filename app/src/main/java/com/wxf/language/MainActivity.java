package com.wxf.language;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseAc {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("第一个Activity");
        findViewById(R.id.btn_setting).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SettingAc.class));
            }
        });
    }
}
