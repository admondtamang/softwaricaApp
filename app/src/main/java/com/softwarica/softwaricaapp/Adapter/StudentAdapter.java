package com.softwarica.softwaricaapp.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.softwarica.softwaricaapp.Model.Student;
import com.softwarica.softwaricaapp.R;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private List<Student> mData;

    public class StudentViewHolder extends RecyclerView.ViewHolder {
        TextView name,address,age,gender;
        ImageView image;
        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.txtName);
            gender=itemView.findViewById(R.id.txtGender);
            address=itemView.findViewById(R.id.txtAddress);
            age=itemView.findViewById(R.id.txtAge);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
