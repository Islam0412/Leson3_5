package com.example.leson3_5;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuAdaptor extends RecyclerView.Adapter <MenuViewHolder> {


        private ArrayList<String> menuList;

        public MenuAdaptor(ArrayList<String> menuList) {
                this.menuList = menuList;
        }

        @NonNull
        @Override
        public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                return new MenuViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu,parent,false));
        }

        @Override
        public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
                holder.bind(menuList.get(position));
        }

        @Override
        public int getItemCount() {
                return menuList.size();
        }
}
