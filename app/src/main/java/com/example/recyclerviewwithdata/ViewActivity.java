package com.example.recyclerviewwithdata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
/**
** created by Arshad.......
 */

public class ViewActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<CustumData> list = new ArrayList<CustumData>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        recyclerView = findViewById(R.id.rview);
        createData();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapt(list, this));
    }
    public void createData(){
        CustumData data = new CustumData();
        data.setName("Arshad");
        data.setAge("22");
        data.setDob("1993");
        list.add(data);
        CustumData data1 = new CustumData();
        data.setName("Khan");
        data.setAge("23");
        data.setDob("1992");
        list.add(data1);
        CustumData data2 = new CustumData();
        data.setName("Alam");
        data.setAge("20");
        data.setDob("1998");
        list.add(data2);
        CustumData data3 = new CustumData();
        data.setName("Prem");
        data.setAge("18");
        data.setDob("2000");
        list.add(data3);
        CustumData data4 = new CustumData();
        data.setName("Naveen");
        data.setAge("26");
        data.setDob("1988");
        list.add(data4);
        CustumData data5 = new CustumData();
        data.setName("Amit");
        data.setAge("29");
        data.setDob("1995");
        list.add(data5);
        CustumData data6 = new CustumData();
        data.setName("Pranav");
        data.setAge("25");
        data.setDob("1989");
        list.add(data6);
        CustumData data7 = new CustumData();
        data.setName("Sameer");
        data.setAge("21");
        data.setDob("1986");
        list.add(data7);
        CustumData data8 = new CustumData();
        data.setName("Garry");
        data.setAge("32");
        data.setDob("1989");
        list.add(data8);

    }
    }
