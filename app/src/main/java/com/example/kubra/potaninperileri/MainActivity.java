package com.example.kubra.potaninperileri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
ArrayList<VeriModeli> dataList;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataList=new ArrayList<VeriModeli>();
        listView= (ListView) findViewById(R.id.listView);
        dataList.add(new VeriModeli("Ayşe Cora","02.03.1993",175,65,R.drawable.ayse_cora,R.drawable.fener));
        dataList.add(new VeriModeli("Ayşegül Günay","25.10.1992",172,60,R.drawable.aysegul_gunay,R.drawable.bellona));
        dataList.add(new VeriModeli("Bahar Çağlar","28.09.1988",190,70,R.drawable.bahar_caglar,R.drawable.yakindogu));
        dataList.add(new VeriModeli("Yasemin Begüm Dalgalar","08.06.1988",185,72,R.drawable.begum_dalgalar,R.drawable.edirne));
        dataList.add(new VeriModeli("Birsel Vardarlı Demirmen","12.07.1984",175,65,R.drawable.birsel_vardarli,R.drawable.fener));
        dataList.add(new VeriModeli("Cansu Köksal","28.04.1994",187,68,R.drawable.cansu_koksal,R.drawable.gs));
        dataList.add(new VeriModeli("Esra Ural","18.08.1991",198,80,R.drawable.esra_ural,R.drawable.fener));
        dataList.add(new VeriModeli("Işıl Alben"," 21.02.1986",170,66,R.drawable.isil_alben,R.drawable.gs));
        dataList.add(new VeriModeli("Kübra Siyahdemir Ekşi","21.06.1986",183,65,R.drawable.kubra_siyahdemir,R.drawable.bjk));
        dataList.add(new VeriModeli("Latoya Antoinette Sanders","11.09.1986",191,65,R.drawable.latoya,R.drawable.mystick));
        dataList.add(new VeriModeli("Olcay Çakır","13.07.1993",182,62,R.drawable.olcay_cakir,R.drawable.yakindogu));
        dataList.add(new VeriModeli("Pelin Derya Bilgiç","15.07.1994",173,62,R.drawable.pelin_bilgic,R.drawable.fener));
        dataList.add(new VeriModeli("Pınar Gezici Demirok","06.08.1991",182,65,R.drawable.pinar_gezici,R.drawable.gs));
        dataList.add(new VeriModeli("Quanitra Hollingsworth","15.11.1988",196,92,R.drawable.quanitra,R.drawable.yakindogu));
        dataList.add(new VeriModeli("Şaziye İvegin Üner","08.02.1982",183,65,R.drawable.saziye_uner,R.drawable.bellona));
        dataList.add(new VeriModeli("Tilbe Şenyürek","26.04.1995",188,71,R.drawable.tilbe_senyurek,R.drawable.botas));
        dataList.add(new VeriModeli("Tuğçe Canıtez","09.11.1990",190,78,R.drawable.tugce_canitez,R.drawable.fener));

        CustomAdapter adapter=new CustomAdapter(this,dataList);
        listView.setAdapter(adapter);
    }}
