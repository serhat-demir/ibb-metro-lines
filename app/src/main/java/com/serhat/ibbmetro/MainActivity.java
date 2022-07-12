package com.serhat.ibbmetro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.serhat.ibbmetro.api.ApiClient;
import com.serhat.ibbmetro.api.ApiInterface;
import com.serhat.ibbmetro.databinding.ActivityMainBinding;
import com.serhat.ibbmetro.model.LineResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private ActivityMainBinding binding;

    private ApiInterface service;

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

        service.getLines().enqueue(new Callback<LineResponse>() {
            @Override
            public void onResponse(Call<LineResponse> call, Response<LineResponse> response) {
                if (response.body() != null) {
                    Log.e(String.valueOf(response.body().getSuccess()), response.body().getData().get(0).getName());
                } else {
                    Log.e("", "Response is null");
                }
            }

            @Override
            public void onFailure(Call<LineResponse> call, Throwable t) {
                Log.e("Error", t.getMessage());
            }
        });
    }
}