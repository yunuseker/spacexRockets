package com.yunuseker.rocket.data.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yunus.seker on 26.01.2019.
 * younuseker@gmail.com
 */
public class RocketMassModel {

    @SerializedName("kg")
    private Integer kg;

    @SerializedName("lb")
    private Integer lb;

    public RocketMassModel(Integer kg, Integer lb) {
        this.kg = kg;
        this.lb = lb;
    }

    public Integer getKg() {
        return kg;
    }

    public void setKg(Integer kg) {
        this.kg = kg;
    }

    public Integer getLb() {
        return lb;
    }

    public void setLb(Integer lb) {
        this.lb = lb;
    }
}
