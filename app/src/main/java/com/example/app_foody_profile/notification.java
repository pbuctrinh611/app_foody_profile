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
        ListViewBean listViewBean = new ListViewBean(R.drawable.f,"[SIÊU HỘI NOWFOOD] Với 30K - Ăn cả bàn tiệc","Tặng bạn yêu và hội bạn mã FOODDAY giảm ngay 40% tối đa 50K cho đơn từ 60K nhé. Cả hội tự tin ăn ngon ngàn món bách đỉnh tại NowFood mà ví vẫn khỏe re nha. Đặt ngay!!!","6h");
        list.add(listViewBean);
        listViewBean = new ListViewBean(R.drawable.a,"[NOWFOOD] Săn món 1 đồng vào Thứ 3 hàng tuần","Now có chương trình khuyến mãi “Nghe vô lý nhưng chỉ 1 đồng” vào Thứ 3 hàng tuần. Một số cửa hàng sẽ giảm giá vài món còn 1 đồng hoặc 10,000 đồng.","10h");
        list.add(listViewBean);
        listViewBean = new ListViewBean(R.drawable.donggia11k,"SIÊU SALE NOWFOOD 11.11 - Ăn đã miệng SIÊU TIỆC 11K!","Quà chiều lai rai sướng miệng, lúc trả tiền thì sướng tay vì GIÁ CHỈ #11K. Chờ chi mà chưa set kèo mở tiệc với hội mỏ khoét, hội chị em văn phòng, hội bạn thân...?","2d");
        list.add(listViewBean);
        listViewBean = new ListViewBean(R.drawable.deal50,"SIÊU SALE NOWFOOD 11.11 - GIẢM NỬA GIÁ, tiệc to quá xá ","Kìm lòng không nổi khi bụng réo mà deal thì nóng hổi!!!! Trưa nay biết ăn gì và săn sale siêu rẻ, giảm 5O% ở đâu rồi nha nha","3d");
        list.add(listViewBean);
        listViewBean = new ListViewBean(R.drawable.freeship,"SIÊU SALE NOWFOOD 11.11 - FREESHIP XTRA LA ĐÀ, đánh chén càng đã!","Mở app Now mà xem, các quán đã giảm tới 50%, nhập mã ALLFREE còn được MIỄN PHÍ VẬN CHUYỂN cho đơn từ 30k. Vậy nên cứ đặt mạnh tay, ăn thật lực nha những chiếc bụng đói ơiiii.","4d");
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