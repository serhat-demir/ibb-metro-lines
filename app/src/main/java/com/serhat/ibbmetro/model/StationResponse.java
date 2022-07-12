package com.serhat.ibbmetro.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StationResponse {
    @SerializedName("Success")
    @Expose
    private Boolean success;

    @SerializedName("Error")
    @Expose
    private Object error;

    @SerializedName("Data")
    @Expose
    private List<Station> data = null;

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

    public List<Station> getData() {
        return data;
    }

    public void setData(List<Station> data) {
        this.data = data;
    }
}