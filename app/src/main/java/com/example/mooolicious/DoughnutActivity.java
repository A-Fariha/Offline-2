package com.example.mooolicious;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

public class DoughnutActivity extends ListActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listDoughnut = getListView();

        ArrayAdapter<Doughnut> listAdapter = new ArrayAdapter<Doughnut>(
                this,
                android.R.layout.simple_list_item_1,
                Doughnut.doughnuts
        );
        listDoughnut.setAdapter(listAdapter);

    }
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        Intent intent = new Intent(DoughnutActivity.this,CatagoryyActivity.class);
        startActivity(intent);
    }
}
