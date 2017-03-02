package com.design.model;

/**
 * Created by kangaroo on 2017-3-2.
 * 展示观察者设计模式的，主题的接口，（也就是被观察者）
 * 用于实现不用的主题的模板。
 */

public interface Subject {

   public void registerObserver(Observer o);//注册，也就是订阅。
   public void cancelObserver(Observer o);//取消订阅。
   public void notifyObservers();//进行通知。

}
