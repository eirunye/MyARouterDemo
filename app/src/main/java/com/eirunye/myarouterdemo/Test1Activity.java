package com.eirunye.myarouterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/com/activity1")
public class Test1Activity extends AppCompatActivity {

    @Autowired
    Long key1;

    @Autowired
    String name;


    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ARouter.getInstance().inject(this);
        setContentView(R.layout.activity_test1);
        text = findViewById(R.id.text);
        text.setText("key1:" + key1 + "\n" + "key3:" + name + "\n" + "key4:");

//        key1 = getIntent().getLongExtra("key1", 0);
//        System.out.println(key1);
//        Log.e("Test1Activity", key1 + "");
    }
}
