package com.serhat.ibbmetro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.serhat.ibbmetro.adapter.LineAdapter;
import com.serhat.ibbmetro.api.ApiClient;
import com.serhat.ibbmetro.api.ApiInterface;
import com.serhat.ibbmetro.databinding.ActivityMainBinding;
import com.serhat.ibbmetro.model.Line;
import com.serhat.ibbmetro.model.LineResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private ActivityMainBinding binding;

    private ApiInterface service;

    private List<Line> lines;
    private LineAdapter lineAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        context = MainActivity.this;
        service = ApiClient.getClient().create(ApiInterface.class);

        //toolbar
        binding.toolbarLines.setTitle(getString(R.string.app_name));
        binding.toolbarLines.setSubtitle(getString(R.string.istanbul_metro_lines));
        setSupportActionBar(binding.toolbarLines);

        //recyclerview
        binding.recyclerViewLines.setHasFixedSize(true);
        binding.recyclerViewLines.setLayoutManager(new LinearLayoutManager(context));

        getLines();
    }

    private void getLines() {
        service.getLines().enqueue(new Callback<LineResponse>() {
            @Override
            public void onResponse(Call<LineResponse> call, Response<LineResponse> response) {
                if (response.body() != null) {
                    lines = response.body().getData();
                    lineAdapter = new LineAdapter(context, lines);
                    binding.recyclerViewLines.setAdapter(lineAdapter);
                } else {
                    Log.e("", getString(R.string.response_is_null));
                }
            }

            @Override
            public void onFailure(Call<LineResponse> call, Throwable t) {
                Log.e(getString(R.string.error), t.getMessage());
            }
        });
    }
}