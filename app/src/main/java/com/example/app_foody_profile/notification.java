package com.example.app_foody_profile;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class notification extends AppCompatActivity {
    private List<ListViewBean> list;
    private RecyclerView recyclerView;
    private RecyclerViewAdapter RecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        addControl();
        addEvent();
    }

    private void addEvent() {
        createData();
    }

    private void createData() {
        ListViewBean listViewBean = new ListViewBean(R.drawable.sillva,"Không săn hơi phí","Tặng bạn yêu và hội bạn mã NOWFOOD","6h");
        list.add(listViewBean);
        listViewBean = new ListViewBean(R.drawable.sillva,"Không săn hơi phí","Tặng bạn yêu và hội bạn mã NOWFOOD","6h");
        list.add(listViewBean);
        listViewBean = new ListViewBean(R.drawable.sillva,"Không săn hơi phí","Tặng bạn yêu và hội bạn mã NOWFOOD","6h");
        list.add(listViewBean);
        listViewBean = new ListViewBean(R.drawable.sillva,"Không săn hơi phí","Tặng bạn yêu và hội bạn mã NOWFOOD","6h");
        list.add(listViewBean);
        RecyclerViewAdapter.notifyDataSetChanged();
    }

    private void addControl() {
        recyclerView=findViewById(R.id.recyclerview);
        list=new ArrayList<>();
        RecyclerViewAdapter = new RecyclerViewAdapter(this,list);
        RecyclerView.LayoutManager mlayout = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mlayout);
        recyclerView.setAdapter(RecyclerViewAdapter);
    }

}