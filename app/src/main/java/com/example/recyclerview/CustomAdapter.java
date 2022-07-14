package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private final ArrayList<BioModal> bioModalArrayList;
    private final Context context;

    public CustomAdapter(ArrayList<BioModal> bioModalArrayList, Context context) {
        this.bioModalArrayList = bioModalArrayList;
        this.context = context;
    }
    public static int getRandom(int max){
        return (int) (Math.random()*max);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView subjectName;
        TextView subjectDesc;
        RelativeLayout rl_bg;

        public ViewHolder(View view) {
            super(view);
            subjectName
                    = (TextView)itemView
                    .findViewById(R.id.textView1);
            subjectDesc
                    = (TextView)itemView
                    .findViewById(R.id.textView2);

            rl_bg = itemView.findViewById(R.id.rl_bg);


        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder( ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_item, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomAdapter.ViewHolder viewHolder, int position) {

        BioModal modal = bioModalArrayList.get(position);

        viewHolder.subjectName.setText(modal.name);
        viewHolder.subjectDesc.setText(modal.desc);

        int number = getRandom(8);
        if(number==1){
            viewHolder.rl_bg.setBackground(ContextCompat.getDrawable(context,R.drawable.gradient1));
        }
        else if(number==2){
            viewHolder.rl_bg.setBackground(ContextCompat.getDrawable(context,R.drawable.gradient2));
        }
        else if(number==3){
            viewHolder.rl_bg.setBackground(ContextCompat.getDrawable(context,R.drawable.gradient3));
        }
        else if(number==4){
            viewHolder.rl_bg.setBackground(ContextCompat.getDrawable(context,R.drawable.gradient4));
        }
        else if(number==5){
            viewHolder.rl_bg.setBackground(ContextCompat.getDrawable(context,R.drawable.gradient5));
        }
        else if(number==6){
            viewHolder.rl_bg.setBackground(ContextCompat.getDrawable(context,R.drawable.gradient6));
        }
        else if(number==7){
            viewHolder.rl_bg.setBackground(ContextCompat.getDrawable(context,R.drawable.gradient7));
        }
        else if(number==8){
            viewHolder.rl_bg.setBackground(ContextCompat.getDrawable(context,R.drawable.gradient8));
        }
        else {
            viewHolder.rl_bg.setBackground(ContextCompat.getDrawable(context,R.drawable.bg));
        }
    }

    @Override
    public int getItemCount() {
        return bioModalArrayList.size();
    }

}
