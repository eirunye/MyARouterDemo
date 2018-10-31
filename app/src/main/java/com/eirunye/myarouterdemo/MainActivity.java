package com.eirunye.myarouterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavCallback;
import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {

    private Button btnTest, btnTest1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTest = findViewById(R.id.btn_test);
        btnTest1 = findViewById(R.id.btn_test1);
        btnTest.setOnClickListener(this::onClickView);
        btnTest1.setOnClickListener(this::onClickView);

    }

    private void onClickView(View view) {
        switch (view.getId()) {
            case R.id.btn_test:
                ARouter.getInstance().build("/test/activity").navigation();
                break;
            case R.id.btn_test1:
                ARouter.getInstance().build("/com/activity1")
//                        .withLong("key1", 666L)
                        .withString("name", "888")
//                        .withObject("key4", new Test("Jack", "Rose"))
                        .navigation();
                break;
        }
    }
}
