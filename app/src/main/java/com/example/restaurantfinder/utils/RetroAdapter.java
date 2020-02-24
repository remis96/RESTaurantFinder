package com.example.restaurantfinder.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.restaurantfinder.R;
import com.example.restaurantfinder.model.pojo_classes.Restaurant;

import java.util.ArrayList;

public class RetroAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Restaurant> dataModelArrayList;

    public RetroAdapter(Context context, ArrayList<Restaurant> restaurants) {
        this.context = context;
        this.dataModelArrayList = restaurants;
    }

    @Override
    public int getViewTypeCount() {
        return getCount();
    }

    @Override
    public int getItemViewType(int position) {

        return position;
    }

    @Override
    public int getCount() {
        return dataModelArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return dataModelArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.retro_lv, null, true);

            holder.name = convertView.findViewById(R.id.name);
            holder.state = convertView.findViewById(R.id.country);
            holder.city = convertView.findViewById(R.id.city);

            convertView.setTag(holder);

        } else {

            holder = (ViewHolder) convertView.getTag();

        }

        holder.name.setText("Name: " + dataModelArrayList.get(position).getName());
        holder.state.setText("Country: " + dataModelArrayList.get(position).getState());
        holder.city.setText("City: " + dataModelArrayList.get(position).getCity());

        return convertView;

    }

    private class ViewHolder {

        protected TextView name, state, city;

    }
}
