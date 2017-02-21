package com.viewlistener;

import android.view.View;

/**
 * Created by kangaroo on 2017-2-21.
 * 接口和类之间决定性的区别是类可以维护状态信息，而接口不可以!
 */

   public interface ViewListener extends View.OnClickListener{

    View onClickListener(View v);
    void onLongListener(View v);
    View getViewListener(View v);

    interface ClickListener{

        int a=1;//默认是public static final
        void getView(View v);
        void setViewListener(View v);
        void getLongViewListener(View v,int position);

    }

    @Override
    void onClick(View v);

    /**
     * 接口的默认方法，可以类实现它可以 不实现这个方法。
     * 在jdk 1.8 版本及以后进行实现。
     */
  /*  default String getString()
    {
        return "Default String";
    }*/

    /**
     * java8 中支持的静态方法。
     */
 /*   static int getDefaultNumber()
    {
        return 0;
    }
*/
}
