package com.example.app_foody_profile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter1 extends RecyclerView.Adapter<RecyclerViewAdapter1.MyViewHolder>{
    private List<ListViewBean1> list;
    private Context context;
    public RecyclerViewAdapter1(Context context, List list){
        this.context=context;
        this.list=list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view=inflater.inflate(R.layout.rowlistview_delivery,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.image.setImageResource(list.get(position).getImage());
        holder.image1.setImageResource(list.get(position).getImage1());
        holder.image2.setImageResource(list.get(position).getImage2());
        holder.title.setText(list.get(position).getTitle());
        holder.content.setText(list.get(position).getContent());
        holder.time.setText(list.get(position).getTime());
        holder.address.setText(list.get(position).getAddress());
        holder.price.setText(list.get(position).getPrice());
        holder.range.setText(list.get(position).getRange());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        TextView content;
        TextView time, price, address, range;
        ImageView image, image1, image2;
        public MyViewHolder(View itemView) {
            super(itemView);
            address = (TextView) itemView.findViewById(R.id.address);
            range = (TextView) itemView.findViewById(R.id.range);
            price = (TextView) itemView.findViewById(R.id.price);
            title = (TextView) itemView.findViewById(R.id.title);
            content = (TextView) itemView.findViewById(R.id.content);
            time = (TextView) itemView.findViewById(R.id.time);
            image = (ImageView) itemView.findViewById(R.id.image);
            image1 = (ImageView) itemView.findViewById(R.id.icon1);
            image2 = (ImageView) itemView.findViewById(R.id.icon2);
        }
    }
}
