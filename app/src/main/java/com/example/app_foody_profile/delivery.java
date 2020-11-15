package com.example.app_foody_profile;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;
import java.util.List;

public class delivery extends AppCompatActivity {
    private List<ListViewBean1> list;
    private RecyclerView recyclerView;
    private RecyclerViewAdapter1  RecyclerViewAdapter;
    LinearLayout linearLayout;
    ImageView[] image;
    private int[] mImages = new int[]{
            R.drawable.banner1,R.drawable.banner2,R.drawable.banner3
    };
    private String[] mImageTitle = new String[]{
            "banner1","banner2","banner3"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);
        addControl();
        addEvent();
        CarouselView carouselView = findViewById(R.id.carousel1);
        carouselView.setPageCount(mImages.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(mImages[position]);
            }
        });
        carouselView.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);
    }

    private void addEvent() {
        createData();
    }

    private void createData() {
        ListViewBean1 listViewBean = new ListViewBean1(R.drawable.trasua,"Bông Food & Drink","6 chi nhánh","> 1km",R.drawable.ic_baseline_attach_money_24,"Giá ~ 22k",R.drawable.ic_baseline_timer_24,"20 '","Coffee/Dessert");
        list.add(listViewBean);
        listViewBean = new ListViewBean1(R.drawable.trasua, "Bông Food & Drink", "6 chi nhánh", "> 1km", R.drawable.ic_baseline_attach_money_24, "Giá ~ 22k", R.drawable.ic_baseline_timer_24, "20 '", "Coffee/Dessert");
        list.add(listViewBean);
        listViewBean = new ListViewBean1(R.drawable.trasua, "Bông Food & Drink", "6 chi nhánh", "> 1km", R.drawable.ic_baseline_attach_money_24, "Giá ~ 22k", R.drawable.ic_baseline_timer_24, "20 '", "Coffee/Dessert");
        list.add(listViewBean);
        listViewBean = new ListViewBean1(R.drawable.trasua, "Bông Food & Drink", "6 chi nhánh", "> 1km", R.drawable.ic_baseline_attach_money_24, "Giá ~ 22k", R.drawable.ic_baseline_timer_24, "20 '", "Coffee/Dessert");
        list.add(listViewBean);
        RecyclerViewAdapter.notifyDataSetChanged();
    }
    private void addControl() {
        recyclerView=findViewById(R.id.recyclerview1);
        list=new ArrayList<>();
        RecyclerViewAdapter = new RecyclerViewAdapter1(this,list);
        RecyclerView.LayoutManager mlayout = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mlayout);
        recyclerView.setAdapter(RecyclerViewAdapter);
    }
}