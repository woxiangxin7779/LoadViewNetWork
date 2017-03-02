package com.design.model;

/**
 * Created by kangaroo on 2017-3-2.
 * 布告板接口。用于观察者设计模式的，主要利用，天气数据和
 * 天气布告板的展示的例子来进行说明。
 * Java API 的内部也有关于观察者的实现的接口，分别为
 * java.util.Observer
 * java.util.Observable (也就是Subject).
 */

public interface Observer {

    public void  update(); //当数据更新时（即接到通知时），进行更新。
}
