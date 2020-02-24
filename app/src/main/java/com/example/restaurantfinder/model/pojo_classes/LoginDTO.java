package com.example.restaurantfinder.model.pojo_classes;

import com.google.gson.annotations.SerializedName;

public class LoginDTO {

    @SerializedName("username")
    private String username;

    @SerializedName("password")
    private String password;

    public LoginDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public LoginDTO() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
