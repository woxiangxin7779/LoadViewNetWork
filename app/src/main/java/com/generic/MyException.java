package com.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by kangaroo on 2017-2-22.
 */

public class MyException extends Exception {

    MyException(Exception e){
        super();
        e.initCause(e);//异常链条。

//        Collections

//        List
    }
}
