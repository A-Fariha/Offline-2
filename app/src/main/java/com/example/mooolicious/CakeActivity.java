package com.example.mooolicious;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

public class CakeActivity extends ListActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listcake = getListView();

        ArrayAdapter<Cake> listAdapter = new ArrayAdapter<Cake>(
                this,
                android.R.layout.simple_list_item_1,
                Cake.cakes
        );
        listcake.setAdapter(listAdapter);

    }
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        Intent intent = new Intent(CakeActivity.this,CatagooryActivity.class);
        startActivity(intent);
    }
}



