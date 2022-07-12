package com.serhat.ibbmetro.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Line {
    @SerializedName("Id")
    @Expose
    private Integer id;

    @SerializedName("Name")
    @Expose
    private String name;

    @SerializedName("Content")
    @Expose
    private String content;

    @SerializedName("ENContent")
    @Expose
    private String eNContent;

    @SerializedName("ARContent")
    @Expose
    private String aRContent;

    @SerializedName("ShortDescription")
    @Expose
    private String shortDescription;

    @SerializedName("LongDescription")
    @Expose
    private String longDescription;

    @SerializedName("ENDescription")
    @Expose
    private String eNDescription;

    @SerializedName("ARDescription")
    @Expose
    private String aRDescription;

    @SerializedName("IsActive")
    @Expose
    private Boolean isActive;

    @SerializedName("FunctionalCode")
    @Expose
    private String functionalCode;
    @SerializedName("Color")
    @Expose
    private LineColor color;

    @SerializedName("Order")
    @Expose
    private Integer order;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getENContent() {
        return eNContent;
    }

    public void setENContent(String eNContent) {
        this.eNContent = eNContent;
    }

    public String getARContent() {
        return aRContent;
    }

    public void setARContent(String aRContent) {
        this.aRContent = aRContent;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getENDescription() {
        return eNDescription;
    }

    public void setENDescription(String eNDescription) {
        this.eNDescription = eNDescription;
    }

    public String getARDescription() {
        return aRDescription;
    }

    public void setARDescription(String aRDescription) {
        this.aRDescription = aRDescription;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public String getFunctionalCode() {
        return functionalCode;
    }

    public void setFunctionalCode(String functionalCode) {
        this.functionalCode = functionalCode;
    }

    public LineColor getColor() {
        return color;
    }

    public void setColor(LineColor color) {
        this.color = color;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}