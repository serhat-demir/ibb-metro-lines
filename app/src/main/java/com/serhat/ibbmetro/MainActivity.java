package com.serhat.ibbmetro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Context;
import android.os.Bundle;

import com.serhat.ibbmetro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        context = MainActivity.this;

        //toolbar
        binding.toolbarLines.setTitle(getString(R.string.app_name));
        binding.toolbarLines.setSubtitle(getString(R.string.istanbul_metro_lines));
        setSupportActionBar(binding.toolbarLines);

        //recyclerview
        binding.recyclerViewLines.setHasFixedSize(true);
        binding.recyclerViewLines.setLayoutManager(new LinearLayoutManager(context));
    }
}