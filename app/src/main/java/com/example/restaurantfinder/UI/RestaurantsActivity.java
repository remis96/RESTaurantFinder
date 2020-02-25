package com.example.restaurantfinder.UI;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

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

public class RestaurantsActivity extends AppCompatActivity {
    private ListView listView;
    private RetroAdapter retroAdapter;
    APIInterface apiInterface;
    Intent intent;
    String bearerToken = "";
    private Button filterButton;
    private EditText searchInput;
    private ProgressBar spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
        apiInterface = APIClient.getClient().create(APIInterface.class);
        listView = findViewById(R.id.lv);
        intent = getIntent();
        bearerToken = intent.getStringExtra("token");
        initialiseComponents();

        String token = "Bearer " + bearerToken;
        Call<List<Restaurant>> call3 = apiInterface.getAll();
        setSpinner(true);
        call3.enqueue(new Callback<List<Restaurant>>() {
            @Override
            public void onResponse(Call<List<Restaurant>> call, Response<List<Restaurant>> response) {
                setSpinner(false);
                ArrayList<Restaurant> arrayList = (ArrayList<Restaurant>) response.body();
                list(arrayList);

            }

            @Override
            public void onFailure(Call<List<Restaurant>> call, Throwable t) {
                setSpinner(false);
                makeToast("Shit's not working m8");
                call.cancel();

            }
        });


    }

    private void list(ArrayList<Restaurant> restaurants) {
        retroAdapter = new RetroAdapter(this, restaurants);
        listView.setAdapter(retroAdapter);
    }

    private void initialiseComponents() {
        filterButton = (Button) findViewById(R.id.filterButtonRestaurantsActivity);
        searchInput = (EditText) findViewById(R.id.editTextSearchRestaurantsActivity);
        spinner = (ProgressBar) findViewById(R.id.progressBarSpinnerRestaurants);
        spinner.setVisibility(View.GONE);
        setOnClickListeners();
    }

    private void setOnClickListeners() {
        filterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(RestaurantsActivity.this, FilterActivity.class);
                RestaurantsActivity.this.startActivity(intent);
            }
        });
    }

    private void makeToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void setSpinner(boolean visible) {
        if(visible) {
            spinner.setVisibility(View.VISIBLE);
        } else {
            spinner.setVisibility(View.GONE);
        }
    }

}
