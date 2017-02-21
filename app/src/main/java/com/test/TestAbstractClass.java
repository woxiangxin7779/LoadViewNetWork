package com.test;

import android.content.Context;
import android.view.View;

import com.viewlistener.ViewListener;

/**
 * Created by kangaroo on 2017-2-21.
 * 抽象类名的修饰也可以是public和默认什么都不写。一个是全局所有的包可以访问。
 * 一个是和接口一样，是在本包内访问。
 */

 public abstract class TestAbstractClass implements ViewListener{


      public String  getString(){

          Context context=null;
          onClickListener(new View(context));
          return "ll";
    }

    /**
     * 抽象类的抽象方法可以是public和protected 修饰。
     * @return
     */
     protected abstract  int getIntValue();

}