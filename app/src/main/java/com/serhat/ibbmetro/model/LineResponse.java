package com.serhat.ibbmetro.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LineResponse {
    @SerializedName("Success")
    @Expose
    private Boolean success;

    @SerializedName("Error")
    @Expose
    private Object error;

    @SerializedName("Data")
    @Expose
    private List<Line> data = null;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public List<Line> getData() {
        return data;
    }

    public void setData(List<Line> data) {
        this.data = data;
    }
}