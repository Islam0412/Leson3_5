package com.example.leson3_5;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MenuViewHolder extends RecyclerView.ViewHolder {



    private TextView tvMenu;



    public MenuViewHolder(@NonNull View itemView) {
        super(itemView);
        tvMenu = itemView.findViewById(R.id.tv_menu);
    }
    public void bind(String menu){
        tvMenu.setText(menu);
    }
}
