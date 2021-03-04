package org.telegram.model;

import javax.persistence.Basic;
import javax.persistence.Entity;

@Entity
public class RecentWeather {

    @Basic
    private String userId;

    @Basic
    private String cityId;

    @Basic
    private String cityName;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
