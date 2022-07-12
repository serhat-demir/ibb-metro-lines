package com.serhat.ibbmetro.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Station {
    @SerializedName("Id")
    @Expose
    private Integer id;

    @SerializedName("Name")
    @Expose
    private String name;

    @SerializedName("LineId")
    @Expose
    private Integer lineId;

    @SerializedName("LineName")
    @Expose
    private String lineName;

    @SerializedName("Description")
    @Expose
    private String description;

    @SerializedName("Order")
    @Expose
    private Integer order;

    @SerializedName("IsActive")
    @Expose
    private Object isActive;

    @SerializedName("FunctionalCode")
    @Expose
    private String functionalCode;

    @SerializedName("DetailInfo")
    @Expose
    private StationDetail detailInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Object getIsActive() {
        return isActive;
    }

    public void setIsActive(Object isActive) {
        this.isActive = isActive;
    }

    public String getFunctionalCode() {
        return functionalCode;
    }

    public void setFunctionalCode(String functionalCode) {
        this.functionalCode = functionalCode;
    }

    public StationDetail getDetailInfo() {
        return detailInfo;
    }

    public void setDetailInfo(StationDetail detailInfo) {
        this.detailInfo = detailInfo;
    }
}