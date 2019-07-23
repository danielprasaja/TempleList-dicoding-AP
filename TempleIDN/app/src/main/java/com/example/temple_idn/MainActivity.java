package com.example.temple_idn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Deklarasi variabel yang diperlukan di kelas MainActivity, dalam hal ini variabel untuk menampung recyclerView dan variabel untuk menampung objek array
    private RecyclerView recyclerView_container;
    private ArrayList<Temple> list = new ArrayList<>();

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

    }
}
