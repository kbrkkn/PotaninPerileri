package com.example.kubra.potaninperileri;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by kubra on 19.06.2017.
 */

public class CustomAdapter extends BaseAdapter {
    ArrayList<VeriModeli> dataList;
    LayoutInflater layoutInflater;
    public CustomAdapter(Activity activity,ArrayList<VeriModeli> dataList){
        this.dataList=dataList;
        layoutInflater= (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int position) {
        return dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View satir=layoutInflater.inflate(R.layout.custom_satir,null);

        VeriModeli data=dataList.get(position);

        ImageView fotoImg= (ImageView) satir.findViewById(R.id.imageViewFoto);
        ImageView kulubImg= (ImageView) satir.findViewById(R.id.imageViewKulub);
        TextView dogum= (TextView) satir.findViewById(R.id.textViewBirthday);
        TextView boy= (TextView) satir.findViewById(R.id.textViewBoy);
        TextView kilo= (TextView) satir.findViewById(R.id.textViewKilo);
        TextView isim= (TextView) satir.findViewById(R.id.textViewName);
        fotoImg.setImageResource(data.getFotoId());
        kulubImg.setImageResource(data.getKulubId());
        dogum.setText(data.getDogumTarihi());
        boy.setText(data.getBoy()+" cm");
        kilo.setText(data.getKilo()+" kg");
        isim.setText(data.getIsim());

        return satir;
    }
}
