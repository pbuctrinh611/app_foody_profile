package com.example.app_foody_profile;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class delivery extends AppCompatActivity {
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
}