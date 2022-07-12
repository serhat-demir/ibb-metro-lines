package com.serhat.ibbmetro.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.serhat.ibbmetro.R;
import com.serhat.ibbmetro.databinding.CardStationBinding;
import com.serhat.ibbmetro.model.Station;

import java.util.List;

public class StationAdapter extends RecyclerView.Adapter<StationAdapter.StationHolder> {
    private Context mContext;
    private List<Station> stations;
    private int[] lineColor;

    public StationAdapter(Context mContext, List<Station> stations, int[] lineColor) {
        this.mContext = mContext;
        this.stations = stations;
        this.lineColor = lineColor;
    }

    public class StationHolder extends RecyclerView.ViewHolder {
        public View stationColor;
        public TextView stationName;
        public ImageView stationLocation;

        public StationHolder(@NonNull CardStationBinding binding) {
            super(binding.getRoot());

            stationColor = binding.stationColor;
            stationName = binding.stationName;
            stationLocation = binding.stationLocation;
        }
    }

    @NonNull
    @Override
    public StationHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardStationBinding binding = CardStationBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new StationHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull StationHolder holder, int position) {
        Station station = stations.get(position);

        holder.stationColor.setBackgroundColor(Color.rgb(lineColor[0], lineColor[1], lineColor[2]));
        holder.stationName.setText(station.getName().toUpperCase());

        holder.stationLocation.setColorFilter(Color.rgb(lineColor[0], lineColor[1], lineColor[2]));
        holder.stationLocation.setOnClickListener(view -> {
            /* String uri = String.format(Locale.ENGLISH, "http://maps.google.com/maps?q=loc:%f,%f", Double.parseDouble(station.getDetailInfo().getLatitude()), Double.parseDouble(station.getDetailInfo().getLongitude()));
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
            mContext.startActivity(intent); */

            Toast.makeText(mContext, mContext.getResources().getString(R.string.loctions_are_not_working), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return stations.size();
    }
}
