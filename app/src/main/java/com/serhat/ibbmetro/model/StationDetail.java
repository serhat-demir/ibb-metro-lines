package com.serhat.ibbmetro.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StationDetail {
    @SerializedName("Escolator")
    @Expose
    private Integer escolator;

    @SerializedName("Lift")
    @Expose
    private Integer lift;

    @SerializedName("BabyRoom")
    @Expose
    private Boolean babyRoom;

    @SerializedName("WC")
    @Expose
    private Boolean wc;

    @SerializedName("Masjid")
    @Expose
    private Boolean masjid;

    @SerializedName("Latitude")
    @Expose
    private String latitude;

    @SerializedName("Longitude")
    @Expose
    private String longitude;

    public Integer getEscolator() {
        return escolator;
    }

    public void setEscolator(Integer escolator) {
        this.escolator = escolator;
    }

    public Integer getLift() {
        return lift;
    }

    public void setLift(Integer lift) {
        this.lift = lift;
    }

    public Boolean getBabyRoom() {
        return babyRoom;
    }

    public void setBabyRoom(Boolean babyRoom) {
        this.babyRoom = babyRoom;
    }

    public Boolean getWc() {
        return wc;
    }

    public void setWc(Boolean wc) {
        this.wc = wc;
    }

    public Boolean getMasjid() {
        return masjid;
    }

    public void setMasjid(Boolean masjid) {
        this.masjid = masjid;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}