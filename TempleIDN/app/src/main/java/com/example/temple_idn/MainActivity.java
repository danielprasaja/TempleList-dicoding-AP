package com.example.temple_idn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Deklarasi variabel yang diperlukan di kelas MainActivity, dalam hal ini variabel untuk menampung recyclerView dan variabel untuk menampung objek array
    private RecyclerView recyclerView_container;
    private ArrayList<Temple> list = new ArrayList<>();
    private TextView tvTempleName;
    private TextView tvTempleLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView_container = findViewById(R.id.recyclerView_container); //inisialisasi recyclerView dengan layout
        recyclerView_container.setHasFixedSize(true);

        list.addAll(TemplesData.getListData());
        showRecyclerList(); //memanggil fungsi untuk menampilkan recyclerView
    }

    private void showRecyclerList() {
        recyclerView_container.setLayoutManager(new LinearLayoutManager(this));
        TempleAdapter templeAdapter = new TempleAdapter(list);
        recyclerView_container.setAdapter(templeAdapter);

        templeAdapter.setOnItemClickCallback(new TempleAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Temple data) {
                Intent templeDetail = new Intent(MainActivity.this, TempleDetailActivity.class);
                templeDetail.putExtra(TempleDetailActivity.TEMPLE_NAME, data.getName());
                templeDetail.putExtra(TempleDetailActivity.TEMPLE_LOCATION, data.getLocation());
                templeDetail.putExtra(TempleDetailActivity.TEMPLE_IMAGE, data.getImage());
                templeDetail.putExtra(TempleDetailActivity.TEMPLE_IMAGE_SRC, data.getSource_img());
                templeDetail.putExtra(TempleDetailActivity.TEMPLE_DETAIL_INFO, data.getDtl_info());
                startActivity(templeDetail);
            }
        });

    }
}
