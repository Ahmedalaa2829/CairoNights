package com.example.firsttry;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomeAdapter extends RecyclerView.Adapter<CustomeAdapter.MyViewHolder> {

   private Context context;
    private ArrayList meetup_id, meetup_title, meetup_address, meetup_time, meetup_contact;

    CustomeAdapter(Context context, ArrayList meetup_id,
                   ArrayList meetup_title,
                   ArrayList meetup_address,
                   ArrayList meetup_time,
                   ArrayList meetup_contact){

        this.context = context;
        this.meetup_id = meetup_id;
        this.meetup_title = meetup_title;
        this.meetup_address = meetup_address;
        this.meetup_time = meetup_time;
        this.meetup_contact = meetup_contact;

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.meetup_id_txt.setText(String.valueOf(meetup_id.get(position)));
        holder.meetup_title_txt.setText(String.valueOf(meetup_title.get(position)));
        holder.meetup_address_txt.setText(String.valueOf(meetup_address.get(position)));
        holder.meetup_time_txt.setText(String.valueOf(meetup_time.get(position)));
        holder.meetup_phone_txt.setText(String.valueOf(meetup_contact.get(position)));

    }

    @Override
    public int getItemCount() {
        return meetup_id.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView meetup_id_txt, meetup_title_txt, meetup_address_txt, meetup_phone_txt, meetup_time_txt;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            meetup_id_txt = itemView.findViewById(R.id.meetup_id_txt);
            meetup_title_txt = itemView.findViewById(R.id.meetup_title_txt);
            meetup_address_txt = itemView.findViewById(R.id.meetup_address_txt);
            meetup_phone_txt = itemView.findViewById(R.id.meetup_phone_txt);
            meetup_time_txt = itemView.findViewById(R.id.meetup_time_txt);

        }
    }
}
