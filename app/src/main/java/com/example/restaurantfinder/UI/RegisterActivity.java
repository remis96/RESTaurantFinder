package com.example.restaurantfinder.UI;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.restaurantfinder.R;
import com.example.restaurantfinder.model.enums.TypeOfUser;
import com.example.restaurantfinder.model.pojo_classes.RegisterDTO;
import com.example.restaurantfinder.utils.APIClient;
import com.example.restaurantfinder.utils.APIInterface;

import java.util.regex.Pattern;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {

    private static final String TAG = "RegisterActivity";
    private EditText name;
    private EditText mail;
    private EditText password;
    private EditText repeatPassword;
    private Button registerButton;
    private Button goToLoginButton;
    private CheckBox adminCheckbox;
    private APIInterface apiInterface;
    private RegisterDTO registerDTO;
    private Intent intentLogin;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initializeUiComponents();
        apiInterface = APIClient.getClient().create(APIInterface.class);
        intentLogin = new Intent(RegisterActivity.this, LoginActivity.class);
    }

    private void initializeUiComponents() {

        name = findViewById(R.id.editTextNameRegister);
        mail = findViewById(R.id.editTextMailRegister);
        password = findViewById(R.id.editTextPasswordRegister);
        repeatPassword = findViewById(R.id.editTextPasswordRepeatRegister);
        registerButton = findViewById(R.id.registerButton);
        goToLoginButton = findViewById(R.id.goToLogin);
        adminCheckbox = findViewById(R.id.isAdminCheckBox);
        initializeOnClickListeners();
    }

    private boolean validEmail(String email) {
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        return pattern.matcher(email).matches();
    }

    private boolean validateForm() {

        if (TextUtils.isEmpty(name.getText().toString())
                || TextUtils.isEmpty(mail.getText().toString())
                || TextUtils.isEmpty(password.getText().toString())
                || TextUtils.isEmpty(repeatPassword.getText().toString())) {
            Toast.makeText(this, "You need to fill all fields", Toast.LENGTH_SHORT).show();
            Log.e(TAG, "validateForm: empty ");
            return false;
        }
        if (!validEmail(mail.getText().toString())) {
            Toast.makeText(this, "You need to enter valid mail adress", Toast.LENGTH_SHORT).show();
            Log.e(TAG, "validateForm: bad mail ");

            return false;
        }
        if (!password.getText().toString().equals(repeatPassword.getText().toString())) {
            makeToast("Passwords don't match");
            Log.e(TAG, "validateForm: bad passwords ");

            return false;
        }
        return true;

    }

    private void registerPerson() {
        Call<RegisterDTO> call = apiInterface.register(this.registerDTO);
        call.enqueue(new Callback<RegisterDTO>() {
            @Override
            public void onResponse(Call<RegisterDTO> call, Response<RegisterDTO> response) {
                makeToast("Account sucessfully created");
                RegisterActivity.this.startActivity(intentLogin);
            }

            @Override
            public void onFailure(Call<RegisterDTO> call, Throwable t) {
                makeToast("Something broke");
                call.cancel();
            }
        });

    }

    private void initializeRegisterDTO() {

        this.registerDTO = new RegisterDTO();
        this.registerDTO.setMailAdress(mail.getText().toString());
        this.registerDTO.setPassword(password.getText().toString());
        this.registerDTO.setUsername(name.getText().toString());

        if (adminCheckbox.isChecked()) {

            this.registerDTO.setTypeOfUser(TypeOfUser.ADMIN);
        } else {

            this.registerDTO.setTypeOfUser(TypeOfUser.USER);
        }
    }

    private void makeToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void initializeOnClickListeners() {
        registerButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (validateForm()) {
                    initializeRegisterDTO();
                    registerPerson();
                }
            }
        });

        goToLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RegisterActivity.this.startActivity(intentLogin);
            }
        });
    }

}
