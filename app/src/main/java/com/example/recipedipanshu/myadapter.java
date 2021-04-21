package com.example.recipedipanshu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class myadapter extends FirebaseRecyclerAdapter<model1,myadapter.myviewholder>
{

    public myadapter(@NonNull FirebaseRecyclerOptions<model1> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull model1 model) {

        holder.name.setText(model.getRecipename());
        Glide.with(holder.img.getContext()).load(model.getRecipeimage()).into(holder.img);
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rview1,parent,false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        ImageView img;
         TextView name;
        public myviewholder(@NonNull View itemView) {
            super(itemView);

                  img=(ImageView)itemView.findViewById(R.id.img1);
                 name=(TextView)itemView.findViewById(R.id.nametext);
        }
    }
}
