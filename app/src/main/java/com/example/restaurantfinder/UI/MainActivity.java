package com.example.restaurantfinder.UI;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.restaurantfinder.R;

public class MainActivity extends AppCompatActivity {

    private Intent intent;
    private String bearerToken = "";
    private Button login;
    private Button register;
    private Button find;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeComponents();
    }

    private void initializeComponents() {
        login = (Button) findViewById(R.id.loginButtonMain);
        register = (Button) findViewById(R.id.registerButtonMain);
        find = (Button) findViewById(R.id.findButtonMain);
        setOnClickListeners();
    }

    private void setOnClickListeners() {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, LoginActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, RegisterActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, FilterActivity.class);
                intent.putExtra("token", "NOT_PRESENT");
                MainActivity.this.startActivity(intent);
            }
        });
    }
}
