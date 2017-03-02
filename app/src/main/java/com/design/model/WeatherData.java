package com.design.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kangaroo on 2017-3-2.
 * 天气数据。
 */

public class WeatherData implements Subject {

    private List<Observer> observers;//维护观察者的集合。

    public WeatherData(List<Observer> observers) {
        observers =new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer o) {

        if(!observers.contains(o)){
            observers.add(o);
        }
    }

    @Override
    public void cancelObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {

        //通知每个观察者。
        for (int i=0;i<observers.size();i++){
            observers.get(i).update();
        }
    }
    //观察者的数量。
    public int countObservers(){
        return observers.size();
    }

}
