package ch02_observer.example_practice.pull_observer;

import ch02_observer.example_practice.push_observer.DisplayElement;

public class ForecastDisplay implements Observer, DisplayElement {

    private WeatherData weatherData;
    private float currentPressure = 29.f;
    private float lastPressure;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("현재 상태: 현재 기압 " + currentPressure + ", 이전 기압 " + lastPressure + "%");
    }

}
