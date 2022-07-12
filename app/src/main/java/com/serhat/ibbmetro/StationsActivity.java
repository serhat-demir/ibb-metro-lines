package com.serhat.ibbmetro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.serhat.ibbmetro.adapter.StationAdapter;
import com.serhat.ibbmetro.api.ApiClient;
import com.serhat.ibbmetro.api.ApiInterface;
import com.serhat.ibbmetro.databinding.ActivityStationsBinding;
import com.serhat.ibbmetro.model.Station;
import com.serhat.ibbmetro.model.StationResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StationsActivity extends AppCompatActivity {
    private Context context;
    private ActivityStationsBinding binding;

    private ApiInterface service;

    private String lineId, lineName;
    private int[] lineColor;

    private List<Station> stations;
    private StationAdapter stationAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStationsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        context = StationsActivity.this;
        service = ApiClient.getClient().create(ApiInterface.class);

        lineId = getIntent().getStringExtra(getString(R.string.intent_extra_line_id));
        lineName = getIntent().getStringExtra(getString(R.string.intent_extra_line_name));
        lineColor = getIntent().getIntArrayExtra(getString(R.string.intent_extra_line_color));

        //toolbar
        binding.toolbarStations.setTitle(getString(R.string.app_name));
        binding.toolbarStations.setSubtitle(lineName.toUpperCase() + " " + getString(R.string.metro_stations));
        setSupportActionBar(binding.toolbarStations);

        //recyclerview
        binding.recyclerViewStations.setHasFixedSize(true);
        binding.recyclerViewStations.setLayoutManager(new LinearLayoutManager(context));

        getStations();
    }

    private void getStations() {
        service.getStationById(lineId).enqueue(new Callback<StationResponse>() {
            @Override
            public void onResponse(Call<StationResponse> call, Response<StationResponse> response) {
                if (response.body() != null) {
                    stations = response.body().getData();
                    stationAdapter = new StationAdapter(context, stations, lineColor);
                    binding.recyclerViewStations.setAdapter(stationAdapter);
                } else {
                    Log.e("", getString(R.string.response_is_null));
                }
            }

            @Override
            public void onFailure(Call<StationResponse> call, Throwable t) {
                Log.e(getString(R.string.error), t.getMessage());
            }
        });
    }
}