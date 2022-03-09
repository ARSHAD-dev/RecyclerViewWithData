package com.example.recyclerviewwithdata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class Adapt extends RecyclerView.Adapter<Adapt.MyView> {
    ArrayList<CustumData> list= new ArrayList();
    Context context;
    public Adapt(ArrayList<CustumData> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapt.MyView onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.viewlayout, parent, false);
        return new MyView(view);
    }
    @Override
    public void onBindViewHolder( MyView holder, int position) {
        holder.name.setText(list.get(position).getName());
        holder.age.setText(list.get(position).getAge());
        holder.date.setText(list.get(position).getDob());
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    public class MyView extends RecyclerView.ViewHolder {
        TextView name, age, date;
        ImageView imageView;
        public MyView(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            age = itemView.findViewById(R.id.age);
            date = itemView.findViewById(R.id.dob);
        }
    }
}

