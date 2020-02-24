package com.example.restaurantfinder.UI;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.restaurantfinder.R;
import com.example.restaurantfinder.model.pojo_classes.Restaurant;
import com.example.restaurantfinder.utils.APIClient;
import com.example.restaurantfinder.utils.APIInterface;
import com.example.restaurantfinder.utils.RetroAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private RetroAdapter retroAdapter;
    APIInterface apiInterface;
    Intent intent;
    String bearerToken = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiInterface = APIClient.getClient().create(APIInterface.class);
        listView = findViewById(R.id.lv);
        intent = getIntent();
        bearerToken = intent.getStringExtra("token");
        ArrayList<Restaurant> resp;


        String token = "Bearer " + bearerToken;
        Call<List<Restaurant>> call3 = apiInterface.getAll(token);
        call3.enqueue(new Callback<List<Restaurant>>() {
            @Override
            public void onResponse(Call<List<Restaurant>> call, Response<List<Restaurant>> response) {
                ArrayList<Restaurant> arrayList = (ArrayList<Restaurant>) response.body();
                list(arrayList);

            }

            @Override
            public void onFailure(Call<List<Restaurant>> call, Throwable t) {
                call.cancel();
            }
        });


    }

    private void list(ArrayList<Restaurant> restaurants) {
        retroAdapter = new RetroAdapter(this, restaurants);
        listView.setAdapter(retroAdapter);
    }


}
