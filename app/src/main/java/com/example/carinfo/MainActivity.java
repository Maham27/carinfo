package com.example.carinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements caradptr.carclick {
     TextView tvCname,tvOname,etNo,tvdes;
     Button btncarinfor,btnownerinfo;
     ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvCname=findViewById(R.id.tvCname);
        tvOname=findViewById(R.id.tvOname);
        tvdes=findViewById(R.id.tvdes);
        etNo=findViewById(R.id.etNo);
        img=findViewById(R.id.img);
        btncarinfor=findViewById(R.id.btncinfo);
        btnownerinfo=findViewById(R.id.btnownerinfor);
        oncarlicked(0);
        btncarinfor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOname.setVisibility(View.GONE);
                etNo.setVisibility(View.GONE);
                tvdes.setVisibility(View.GONE);
                tvCname.setVisibility(View.VISIBLE);
                img.setVisibility(View.VISIBLE);
            }
        });
        btnownerinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCname.setVisibility(View.GONE);
                img.setVisibility(View.GONE);
                tvdes.setVisibility(View.VISIBLE);
               tvOname.setVisibility(View.VISIBLE);
                etNo.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    public void oncarlicked(int index) {
        tvCname.setText(cardata.c.get(index).getCname());
        tvOname.setText(cardata.c.get(index).getOname());
        etNo.setText(cardata.c.get(index).getNo());
        if(cardata.c.get(index).getCimg().equals("mercedes"))
        {
            img.setImageResource(R.drawable.mercedes);
        }
        else if (cardata.c.get(index).getCimg().equals("nissan"))
        {
            img.setImageResource(R.drawable.nissan);
        }
        if(cardata.c.get(index).getCimg().equals("volkswagen"))
        {
            img.setImageResource(R.drawable.volkswagen);
        }

    }
}