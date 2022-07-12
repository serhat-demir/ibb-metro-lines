package com.serhat.ibbmetro.api;

import com.serhat.ibbmetro.model.LineResponse;
import com.serhat.ibbmetro.model.StationResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {
    @GET("GetLines")
    Call<LineResponse> getLines();

    @GET("GetStationById/{id}")
    Call<StationResponse> getStationById(@Path("id") String id);
}
