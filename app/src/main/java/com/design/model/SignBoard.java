package com.design.model;

/**
 * Created by kangaroo on 2017-3-2.
 * 布告板。
 */

public class SignBoard implements Observer,DisplayElement {

    private WeatherData weatherData;

    public SignBoard(WeatherData weatherData) {
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {

        //当更新的时候进行展示刷新。
        display();
//        s.cancelObserver(this);
    }

    @Override
    public void display() {
        //具体的展示的逻辑。

    }
}
