package com.example.a210311_btobdigitaleconomy;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListAdapter extends ArrayAdapter {

    private Activity mContext;
    List<Startups> startupsList;

    public ListAdapter(Activity mContext, List<Startups> startupsList){
        super(mContext, R.layout.list_item2,startupsList);
        this.mContext = mContext;
        this.startupsList = startupsList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = mContext.getLayoutInflater();
        View listItemView = inflater.inflate(R.layout.list_item2,null,true);

        TextView tvName = listItemView.findViewById(R.id.tvName);
        TextView tvIndustry = listItemView.findViewById(R.id.tvIndustry);
        TextView tvRank = listItemView.findViewById(R.id.tvRank);

        Startups startups = startupsList.get(position);
        tvName.setText(startups.getName());
        tvIndustry.setText(startups.getIndustry());
        tvRank.setText(startups.getRank());

        return listItemView;
    }
}
