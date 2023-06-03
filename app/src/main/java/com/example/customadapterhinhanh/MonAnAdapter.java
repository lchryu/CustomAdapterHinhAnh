package com.example.customadapterhinhanh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MonAnAdapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List<MonAn> arrMonAn;

    public MonAnAdapter(Context myContext, int myLayout, List<MonAn> arrMonAn) {
        this.myContext = myContext;
        this.myLayout = myLayout;
        this.arrMonAn = arrMonAn;
    }

    @Override
    public int getCount() {
        return arrMonAn.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(myLayout, null);

        // ánh xạ và gán giá trị
        TextView txtTen = (TextView) convertView.findViewById(R.id.textViewTenMonAn);
        txtTen.setText(arrMonAn.get(position).Ten);

        TextView txtGia = (TextView) convertView.findViewById(R.id.textViewGiaMonAn);
        txtGia.setText(arrMonAn.get(position).Gia.toString());

        ImageView imgHinh = (ImageView) convertView.findViewById(R.id.imageViewHinh);
        imgHinh.setImageResource(arrMonAn.get(position).Hinh);

        return convertView;
    }
}
