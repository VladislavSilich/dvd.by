package com.example.silich.vladislav.d4dby.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.silich.vladislav.d4dby.R;

import java.util.ArrayList;

/**
 * Created by Lenovo on 13.09.2017.
 */

public class RecyclerSellersAdapter extends RecyclerView.Adapter<RecyclerSellersAdapter.ViewHolder> {


    private ArrayList<String> mContent;
    private ArrayList<String > mLocation;
    private ArrayList<String> mTelephone;
    private Context context;


    public RecyclerSellersAdapter( ArrayList<String> mContent,ArrayList<String> mLocation,ArrayList<String>mTelephone,Context context) {
        this.mTelephone = mTelephone;
        this.mLocation = mLocation;
        this.mContent = mContent;
        this.context = context;

    }
    public  class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView txtName;
        public TextView txtLocation;
        public TextView txtPhone;
        public ViewHolder(View v) {
            super(v);
            txtName = (TextView)v.findViewById(R.id.txtName);
            txtLocation = (TextView)v.findViewById(R.id.txtLocation);
            txtPhone = (TextView)v.findViewById(R.id.txtNumber);

            txtPhone.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
            Intent phone = new Intent(Intent.ACTION_DIAL);
            phone.setData(Uri.parse("tel:" + mTelephone.get(getPosition())));
            phone.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(phone);
        }
    }
    @Override
    public RecyclerSellersAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                                int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_sellers, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txtName.setText(mContent.get(position));
        holder.txtLocation.setText(mLocation.get(position));
        holder.txtPhone.setText(mTelephone.get(position));

    }
    @Override
    public int getItemCount() {
        return mContent.size();
    }
}