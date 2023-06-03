package com.example.customadapterhinhanh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMonAn;
    ArrayList<MonAn> mangMonAn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMonAn = (ListView) findViewById(R.id.listViewMonAn);
        mangMonAn = new ArrayList<MonAn>();

        mangMonAn.add(new MonAn("Bánh mì", 20000, R.drawable.banhmi));
        mangMonAn.add(new MonAn("Bún bò", 30000, R.drawable.bunbo));
        mangMonAn.add(new MonAn("Bún chả", 35000, R.drawable.buncha));
        mangMonAn.add(new MonAn("Phở", 40000, R.drawable.pho));
        mangMonAn.add(new MonAn("Riêu cua", 25000, R.drawable.rieucua));

        MonAnAdapter adapter = new MonAnAdapter(
                MainActivity.this,
                R.layout.dong_mon_an,
                mangMonAn
        );
        lvMonAn.setAdapter(adapter);
    }
}