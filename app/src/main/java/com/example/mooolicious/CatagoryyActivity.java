package com.example.mooolicious;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CatagoryyActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView colorfuldoughnut, vanillacakedoughnut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagoryy);

        colorfuldoughnut = (ImageView) findViewById(R.id.colorfuldoughnutImageViewId);
        vanillacakedoughnut = (ImageView) findViewById(R.id.vanillacakedoughnutImageViewId);
        colorfuldoughnut.setOnClickListener(this);
        vanillacakedoughnut.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.colorfuldoughnutImageViewId){
            colorfuldoughnut.setVisibility(View.GONE);
            vanillacakedoughnut.setVisibility(View.VISIBLE);
        }
        else if (v.getId()==R.id.vanillacakedoughnutImageViewId){
            vanillacakedoughnut.setVisibility(View.GONE);
            colorfuldoughnut.setVisibility(View.VISIBLE);
        }

    }
}
