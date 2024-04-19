package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder>{
    private static int viewHolderCount;
    private int ListItems;
    private int amount1;
    private int amount2;

    public ListAdapter(int ListOfItems, int amount1, int amount2) {
        ListItems = ListOfItems;
        this.amount1 = amount1;
        this.amount2 = amount2;
        viewHolderCount = 0;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int list_item = R.layout.list_item;

        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(list_item, parent, false);

        ListViewHolder viewHolder = new ListViewHolder(view);
        viewHolder.viewHolderIndex.setText("Index" + amount1 + amount2);
        viewHolderCount++;
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return ListItems;
    }


    class ListViewHolder extends RecyclerView.ViewHolder {
        TextView textView1;
        TextView viewHolderIndex;
        public ListViewHolder(View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.textView1);
            viewHolderIndex = itemView.findViewById(R.id.viewHolderIndex);
        }
        void bind(int listIndex){
            textView1.setText(String.valueOf(listIndex));
        }
    }
}
