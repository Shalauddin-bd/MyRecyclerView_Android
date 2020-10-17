package com.example.myrecylcerviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    Context context;
    String[] titleList;
    String[] descriptionList;
    int[] itemImageList;

    private OnRecyclerListItemClickListener onRecyclerListItemClickListener;

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView rowTitle;
        TextView rowDescription;
        ImageView rowImage;

        OnRecyclerListItemClickListener onRecyclerListItemClickListener;
        public ViewHolder(@NonNull View itemView, OnRecyclerListItemClickListener onRecyclerListItemClickListener) {
            super(itemView);

            rowTitle = itemView.findViewById(R.id.textViewTitle);
            rowDescription = itemView.findViewById(R.id.textViewDescription);
            rowImage = itemView.findViewById(R.id.imageViewItemImage);
            this.onRecyclerListItemClickListener = onRecyclerListItemClickListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onRecyclerListItemClickListener.OnListItemClick(getAdapterPosition());
        }
    }

    public RecyclerAdapter(Context context, String[] titleList, String[] descriptionList, int[] itemImageList, OnRecyclerListItemClickListener onRecyclerListItemClickListener) {
        this.context = context;
        this.titleList = titleList;
        this.descriptionList = descriptionList;
        this.itemImageList = itemImageList;
        this.onRecyclerListItemClickListener = onRecyclerListItemClickListener;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater= LayoutInflater.from(context);
        View view = layoutInflater.inflate( R.layout.single_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view, onRecyclerListItemClickListener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {

        holder.rowTitle.setText(titleList[position]);
        holder.rowDescription.setText(descriptionList[position]);
        holder.rowImage.setImageResource(itemImageList[position]);
    }

    @Override
    public int getItemCount() {
        return titleList.length;
    }

    public interface OnRecyclerListItemClickListener{
        void OnListItemClick(int position);
    }
}
