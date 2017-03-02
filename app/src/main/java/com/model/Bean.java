package com.model;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.Serializable;
/**
 * Created by kangaroo on 2017-2-27.
 * bean 测试类。
 */

public class Bean implements Serializable ,PropertyChangeListener{

    private Circle<String>[] lists;


    public Bean(Circle<String>[] lists) {
        this.lists = lists;
    }

    public Circle<String>[] getLists() {
        return lists;
    }

    public void setLists(Circle<String>[] lists) {
        this.lists = lists;
    }


    @Override
    public void propertyChange(PropertyChangeEvent evt) {

    }
}
