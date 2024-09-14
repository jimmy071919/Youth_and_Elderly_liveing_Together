package com.example.youth_and_elderly_liveing_together_new;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RCAdapter extends RecyclerView.Adapter<RCAdapter.RCViewHolder> {

    private Context context;
    private ArrayList<RCModel> modelArrayList;

    public RCAdapter(Context context, ArrayList<RCModel> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @NonNull
    @Override
    public RCViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.rc_item, parent, false);
        return new RCViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RCViewHolder holder, int position) {
        RCModel rcModel = modelArrayList.get(position);
        holder.rc_Image.setImageResource(rcModel.getImage());
        holder.rc_Title.setText(rcModel.getTitle());
    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public static class RCViewHolder extends RecyclerView.ViewHolder {
        ImageView rc_Image;
        TextView rc_Title;

        public RCViewHolder(@NonNull View itemView) {
            super(itemView);
            rc_Image = itemView.findViewById(R.id.rc_image);
            rc_Title = itemView.findViewById(R.id.rc_title);
        }
    }
}
