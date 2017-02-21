package com.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.picasso.loadview.R;
import com.test.TestAbstractClass;
import com.test.TestInterface;

/**
 * Created by kangaroo on 2017-2-20.
 */

public class MaterialDesignActivity extends AppCompatActivity {

    public  TestInterface testInterface;
    private TestAbstractClass  testAbstractClass;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_design);
        testInterface=new TestInterface();
        testAbstractClass=  new TestAbstractClass(){

            @Override
            protected int getIntValue() {
                return 0;
            }

            @Override
            public View onClickListener(View v) {
                return null;
            }

            @Override
            public void onLongListener(View v) {

            }

            @Override
            public View getViewListener(View v) {
                return null;
            }

            @Override
            public void onClick(View v) {

            }
        };

    }
}
