package com.example.servingwebcontent;

public class TemperatureControl {

    private int temperature;

    public void setTemperature(int temp) {
        if (temp < 0 || temp > 100) {
            throw new IllegalArgumentException("Invalid temperature");
        }
        this.temperature = temp;
    }

    public int getTemperature() {
        return temperature;
    }
}
