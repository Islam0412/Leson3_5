  package com.example.leson3_5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

  public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> menuList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        menuList.add("пицца");
        menuList.add("плов ");
        menuList.add("щи");
        menuList.add("шашлык ");
        menuList.add("дошик");
        menuList.add("вино ");
        menuList.add(" сок");
        menuList.add("мыса ");
        menuList.add("дук ");
        menuList.add(" дым ляма");
        menuList.add(" мяса на жаровне");
        menuList.add("плов ");
        menuList.add("курица в кислом слатком соусе ");
        menuList.add("рыба на жаровне ");
        
        MenuAdaptor adaptor = new MenuAdaptor(menuList);
        recyclerView.setAdapter(adaptor);
    }
}