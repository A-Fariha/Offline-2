package com.example.mooolicious;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class IceCreamActivity extends ListActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listIcecream = getListView();

        ArrayAdapter<IceCream> listAdapter = new ArrayAdapter<IceCream>(
                this,
                android.R.layout.simple_list_item_1,
                IceCream.icecream
        );
        listIcecream.setAdapter(listAdapter);
    }
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        Intent intent = new Intent(IceCreamActivity.this,CatagoryActivity.class);
        //intent.putExtra(SecondActivity.EXTRA_DRINKNO, (int) id);
        startActivity(intent);

    }
}
