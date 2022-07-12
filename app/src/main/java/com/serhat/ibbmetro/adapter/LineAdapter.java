package com.serhat.ibbmetro.adapter;

import android.annotation.SuppressLint;
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
import com.serhat.ibbmetro.databinding.CardLineBinding;
import com.serhat.ibbmetro.model.Line;
import com.serhat.ibbmetro.model.LineColor;

import java.util.List;
import java.util.Locale;

public class LineAdapter extends RecyclerView.Adapter<LineAdapter.LineHolder> {
    private Context mContext;
    private List<Line> lines;

    public LineAdapter(Context mContext, List<Line> lines) {
        this.mContext = mContext;
        this.lines = lines;
    }

    public class LineHolder extends RecyclerView.ViewHolder {
        public View lineColor;
        public TextView lineName, lineDescription, lineStatus;
        public ImageView lineStations;

        public LineHolder(@NonNull CardLineBinding binding) {
            super(binding.getRoot());

            lineColor = binding.lineColor;
            lineName = binding.lineName;
            lineDescription = binding.lineDescription;
            lineStatus = binding.lineStatus;
            lineStations = binding.lineStations;
        }
    }

    @NonNull
    @Override
    public LineHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardLineBinding binding = CardLineBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new LineHolder(binding);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull LineHolder holder, int position) {
        Line line = lines.get(position);

        LineColor color = line.getColor();
        int colorR = Integer.parseInt(color.getColorR());
        int colorG = Integer.parseInt(color.getColorG());
        int colorB = Integer.parseInt(color.getColorB());

        if (Locale.getDefault().getDisplayLanguage().equals(mContext.getResources().getString(R.string.lang_turkish))) {
            holder.lineDescription.setText(line.getLongDescription());
        } else {
            holder.lineDescription.setText(line.getENDescription());
        }

        String status = line.getIsActive() ? mContext.getResources().getString(R.string.card_line_status_active) : mContext.getResources().getString(R.string.card_line_status_inactive);

        holder.lineColor.setBackgroundColor(Color.rgb(colorR, colorG, colorB));
        holder.lineName.setText(line.getName().toUpperCase());
        holder.lineStatus.setText(mContext.getResources().getString(R.string.card_line_status) + " " + status);

        holder.lineStations.setOnClickListener(view -> {
            Toast.makeText(mContext, String.valueOf(line.getId()), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return lines.size();
    }
}
