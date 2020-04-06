package com.xemplarsoft.apps.whatever.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.recyclerview.widget.RecyclerView;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.FoodHolder> {

    public static class FoodHolder extends RecyclerView.ViewHolder{
        public RelativeLayout layout;
        public FoodHolder(View v){
            super(v);
            this.layout = (RelativeLayout) v;
        }
    }

    public FoodHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    public void onBindViewHolder(FoodHolder holder, int position) {

    }

    public int getItemCount() {
        return 0;
    }
}
