package com.coolweather.android.db;

import org.litepal.exceptions.DataSupportException;

public class County extends DataSupportException {
    private int id;
    private String coutyName;
    private String weatherld;
    private int cityld;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoutyName() {
        return coutyName;
    }

    public void setCoutyName(String coutyName) {
        this.coutyName = coutyName;
    }

    public String getWeatherld() {
        return weatherld;
    }

    public void setWeatherld(String weatherld) {
        this.weatherld = weatherld;
    }

    public int getCityld() {
        return cityld;
    }

    public void setCityld(int cityld) {
        this.cityld = cityld;
    }
}
