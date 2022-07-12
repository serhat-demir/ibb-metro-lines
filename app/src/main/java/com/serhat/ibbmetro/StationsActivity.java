package com.serhat.ibbmetro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Context;
import android.os.Bundle;

import com.serhat.ibbmetro.databinding.ActivityStationsBinding;

public class StationsActivity extends AppCompatActivity {
    private Context context;
    private ActivityStationsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStationsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        context = StationsActivity.this;

        //toolbar
        binding.toolbarStations.setTitle(getString(R.string.app_name));
        binding.toolbarStations.setSubtitle(getString(R.string.metro_stations));
        setSupportActionBar(binding.toolbarStations);

        //recyclerview
        binding.recyclerViewStations.setHasFixedSize(true);
        binding.recyclerViewStations.setLayoutManager(new LinearLayoutManager(context));
    }
}