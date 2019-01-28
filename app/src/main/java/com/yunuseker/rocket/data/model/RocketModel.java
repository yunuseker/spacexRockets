package com.yunuseker.rocket.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class RocketModel {

    @SerializedName("id")
    private Integer id;

    @SerializedName("active")
    private Boolean active;

    @SerializedName("stages")
    private Integer stages;

    @SerializedName("boosters")
    private Integer boosters;

    @SerializedName("cost_per_launch")
    private Integer costPerLaunch;

    @SerializedName("success_rate_pct")
    private Integer successRatePct;

    @SerializedName("first_flight")
    private String firstFlight;

    @SerializedName("country")
    private String country;

    @SerializedName("company")
    private String company;

    @SerializedName("height")
    private RocketHeightModel height;

    @SerializedName("mass")
    private RocketMassModel mass;

    @SerializedName("flickr_images")
    private ArrayList<String> images;

    @SerializedName("wikipedia")
    private String wikipedia;

    @SerializedName("description")
    private String description;

    @SerializedName("rocket_id")
    private String rocketId;

    @SerializedName("rocket_name")
    private String rocketName;

    @SerializedName("rocket_type")
    private String rocketType;

    public RocketModel() {
    }

    public RocketModel(Integer id, Boolean active, Integer stages, Integer boosters, Integer costPerLaunch, Integer successRatePct, String firstFlight, String country, String company, RocketHeightModel height, RocketMassModel mass, String wikipedia, String description, String rocketId, String rocketName, String rocketType) {
        this.id = id;
        this.active = active;
        this.stages = stages;
        this.boosters = boosters;
        this.costPerLaunch = costPerLaunch;
        this.successRatePct = successRatePct;
        this.firstFlight = firstFlight;
        this.country = country;
        this.company = company;
        this.height = height;
        this.mass = mass;
        this.wikipedia = wikipedia;
        this.description = description;
        this.rocketId = rocketId;
        this.rocketName = rocketName;
        this.rocketType = rocketType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getStages() {
        return stages;
    }

    public void setStages(Integer stages) {
        this.stages = stages;
    }

    public Integer getBoosters() {
        return boosters;
    }

    public void setBoosters(Integer boosters) {
        this.boosters = boosters;
    }

    public Integer getCostPerLaunch() {
        return costPerLaunch;
    }

    public void setCostPerLaunch(Integer costPerLaunch) {
        this.costPerLaunch = costPerLaunch;
    }

    public Integer getSuccessRatePct() {
        return successRatePct;
    }

    public void setSuccessRatePct(Integer successRatePct) {
        this.successRatePct = successRatePct;
    }

    public String getFirstFlight() {
        return firstFlight;
    }

    public void setFirstFlight(String firstFlight) {
        this.firstFlight = firstFlight;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public RocketHeightModel getHeight() {
        return height;
    }

    public void setHeight(RocketHeightModel height) {
        this.height = height;
    }

    public RocketMassModel getMass() {
        return mass;
    }

    public void setMass(RocketMassModel mass) {
        this.mass = mass;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    public String getWikipedia() {
        return wikipedia;
    }

    public void setWikipedia(String wikipedia) {
        this.wikipedia = wikipedia;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRocketId() {
        return rocketId;
    }

    public void setRocketId(String rocketId) {
        this.rocketId = rocketId;
    }

    public String getRocketName() {
        return rocketName;
    }

    public void setRocketName(String rocketName) {
        this.rocketName = rocketName;
    }

    public String getRocketType() {
        return rocketType;
    }

    public void setRocketType(String rocketType) {
        this.rocketType = rocketType;
    }
}

