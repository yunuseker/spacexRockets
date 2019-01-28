package com.yunuseker.rocket.ui.viewentity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by yunus.seker on 26.01.2019.
 * younuseker@gmail.com
 */
public class RocketViewEntity implements Parcelable {
    private String id;
    private String name;
    private String mass;
    private String meters;
    private String image;
    private String firstDate;
    private String description;

    public RocketViewEntity() {
    }

    protected RocketViewEntity(Parcel in) {
        id = in.readString();
        name = in.readString();
        mass = in.readString();
        meters = in.readString();
        image = in.readString();
        firstDate = in.readString();
        description = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(name);
        dest.writeString(mass);
        dest.writeString(meters);
        dest.writeString(image);
        dest.writeString(firstDate);
        dest.writeString(description);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<RocketViewEntity> CREATOR = new Creator<RocketViewEntity>() {
        @Override
        public RocketViewEntity createFromParcel(Parcel in) {
            return new RocketViewEntity(in);
        }

        @Override
        public RocketViewEntity[] newArray(int size) {
            return new RocketViewEntity[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getMeters() {
        return meters;
    }

    public void setMeters(String meters) {
        this.meters = meters;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(String firstDate) {
        this.firstDate = firstDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
