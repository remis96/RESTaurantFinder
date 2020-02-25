package com.example.restaurantfinder.UI;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.restaurantfinder.R;

public class FilterActivity extends AppCompatActivity {

    private Button submit;
    private Intent intent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_filter);
        initialisteComponents();

    }

    private void initialisteComponents() {
        submit = (Button) findViewById(R.id.submitFilterButton);
        setOnClickListeners();
    }

    private void setOnClickListeners() {
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(FilterActivity.this, RestaurantsActivity.class);
                FilterActivity.this.startActivity(intent);
            }
        });
    }


}
