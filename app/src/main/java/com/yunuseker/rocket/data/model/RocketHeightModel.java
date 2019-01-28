package com.yunuseker.rocket.data.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yunus.seker on 26.01.2019.
 * younuseker@gmail.com
 */
public class RocketHeightModel {

    @SerializedName("meters")
    private Float meters;

    @SerializedName("feet")
    private Float feet;

    public RocketHeightModel() {
    }

    public Float getMeters() {
        return meters;
    }

    public void setMeters(Float meters) {
        this.meters = meters;
    }

    public Float getFeet() {
        return feet;
    }

    public void setFeet(Float feet) {
        this.feet = feet;
    }
}
