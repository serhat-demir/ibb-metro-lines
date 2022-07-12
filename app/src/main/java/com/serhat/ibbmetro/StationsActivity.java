package com.serhat.ibbmetro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Context;
import android.os.Bundle;

import com.serhat.ibbmetro.api.ApiClient;
import com.serhat.ibbmetro.api.ApiInterface;
import com.serhat.ibbmetro.databinding.ActivityStationsBinding;

public class StationsActivity extends AppCompatActivity {
    private Context context;
    private ActivityStationsBinding binding;

    private ApiInterface service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStationsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        context = StationsActivity.this;
        service = ApiClient.getClient().create(ApiInterface.class);

        //toolbar
        binding.toolbarStations.setTitle(getString(R.string.app_name));
        binding.toolbarStations.setSubtitle(getString(R.string.metro_stations));
        setSupportActionBar(binding.toolbarStations);

        //recyclerview
        binding.recyclerViewStations.setHasFixedSize(true);
        binding.recyclerViewStations.setLayoutManager(new LinearLayoutManager(context));
    }
}