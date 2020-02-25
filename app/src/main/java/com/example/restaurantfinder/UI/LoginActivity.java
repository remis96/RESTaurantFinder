package com.example.restaurantfinder.UI;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.restaurantfinder.R;
import com.example.restaurantfinder.model.pojo_classes.LoginDTO;
import com.example.restaurantfinder.utils.APIClient;
import com.example.restaurantfinder.utils.APIInterface;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    private EditText loginName;
    private EditText loginPassword;
    private Button loginButton;
    private LoginDTO loginDTO;
    private APIInterface apiInterface;
    private Intent intentMainMenu;
    private String bearerToken = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        apiInterface = APIClient.getClient().create(APIInterface.class);
        intentMainMenu = new Intent(LoginActivity.this, MainActivity.class);
        initializeComponents();
    }

    private void initializeComponents() {
        loginName = findViewById(R.id.editTextNameLogin);
        loginPassword = findViewById(R.id.editTextPasswordLogin);
        loginButton = findViewById(R.id.loginButton);
        setOnClickListeners();
    }

    private void setOnClickListeners() {
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validateForm()) {
                    initializeLoginDTO();
                    loginPerson();
                }
            }
        });
    }

    private void loginPerson() {
        Call<JsonObject> call = apiInterface.login(this.loginDTO);
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                makeToast("Account sucessfully logged in");

                if (response.body().has("token")) {
                    bearerToken = response.body().get("token").getAsString();
                    intentMainMenu.putExtra("token", bearerToken);
                    LoginActivity.this.startActivity(intentMainMenu);
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                makeToast("Fuck, something broke");
                call.cancel();
            }
        });
    }

    private void initializeLoginDTO() {
        loginDTO = new LoginDTO();
        loginDTO.setUsername(loginName.getText().toString());
        loginDTO.setPassword(loginPassword.getText().toString());
    }

    private boolean validateForm() {
        if (TextUtils.isEmpty(loginName.getText().toString())) {
            makeToast("You need to fill in username");
            return false;
        }
        if (TextUtils.isEmpty(loginPassword.getText().toString())) {
            makeToast("You need to fill in password");
            return false;
        }
        return true;

    }

    private void makeToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }


}
