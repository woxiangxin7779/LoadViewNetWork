package com.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.picasso.loadview.R;
import com.test.TestAbstractClass;
import com.test.TestInterface;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

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
//        List<T> list=new ArrayList<>() ;

//        List
//        ListIterator
//        Map
//        HashMap
//        Hashtable
//        Queue
//        AbstractCollection
//        NavigableSet
//        TreeMap
//        HashSet
//        Stack
//        ArrayList

//        Collections

    }
}
