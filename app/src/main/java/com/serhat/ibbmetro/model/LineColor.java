package com.serhat.ibbmetro.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LineColor {
    @SerializedName("Color_R")
    @Expose
    private String colorR;

    @SerializedName("Color_G")
    @Expose
    private String colorG;

    @SerializedName("Color_B")
    @Expose
    private String colorB;

    public String getColorR() {
        return colorR;
    }

    public void setColorR(String colorR) {
        this.colorR = colorR;
    }

    public String getColorG() {
        return colorG;
    }

    public void setColorG(String colorG) {
        this.colorG = colorG;
    }

    public String getColorB() {
        return colorB;
    }

    public void setColorB(String colorB) {
        this.colorB = colorB;
    }
}