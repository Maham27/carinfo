package com.example.carinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class caradptr extends RecyclerView.Adapter<caradptr.ViewHolder> {
    ArrayList<car> cars;
    carclick ck;

    public caradptr(Context context, ArrayList<car> clist)
    {
        cars=clist;
        ck=(carclick) context;

    }
    public interface carclick
    {
        public void oncarlicked(int index);
    }

    public class ViewHolder  extends RecyclerView.ViewHolder
    {
        TextView tvcname,tvoname;
        EditText tvono;
        ImageView imc;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvcname=itemView.findViewById(R.id.tvcname);
            tvoname=itemView.findViewById(R.id.tvoname);
            tvono=itemView.findViewById(R.id.tvono);
            imc=itemView.findViewById(R.id.imc);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ck.oncarlicked(cars.indexOf((car)itemView.getTag()));

                }
            });
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvcname.setText(cars.get(position).getCname());
        holder.tvoname.setText(cars.get(position).getOname());
        holder.tvono.setText(cars.get(position).getNo());
        if(cars.get(position).getCimg().equals("mercedes"))
        {
            holder.imc.setImageResource(R.drawable.mercedes);
        }
        else if (cars.get(position).getCimg().equals("nissan"))
        {
            holder.imc.setImageResource(R.drawable.nissan);
        }
        if(cars.get(position).getCimg().equals("volkswagen"))
        {
            holder.imc.setImageResource(R.drawable.volkswagen);
        }
        holder.itemView.setTag(cars.get(position));
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }
}
