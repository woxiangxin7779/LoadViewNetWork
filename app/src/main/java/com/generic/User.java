package com.generic;

import com.model.Circle;
import com.model.Rectangle;
import com.model.Shape;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Created by kangaroo on 2017-2-21.
 */

public class User   implements Cloneable,Serializable{

    private String userName="";

   public void setUserName(String userName) throws MyException{

       Map<String,String> k=new HashMap<>();
       this.userName=userName;

       ArrayList<?extends Object> al = new ArrayList<String>();
       ArrayList<? super String> al2 = new ArrayList<String>();

       /**
        * 只能调用Object的方法。因为类型不确定。
        */
       al.get(0).toString();
       al2.get(0).toString();// 只能调用String的父类的方法，即Object.
    }

    public String getUserName() {


        List<Shape> data=new ArrayList<>();

        Rectangle r=new Rectangle();
        Circle c =new Circle();
        data.add(r);
        data.add(c);
        return userName;
    }
}
