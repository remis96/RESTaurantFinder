package com.example.restaurantfinder.model;

import com.example.restaurantfinder.enums.TypeOfUser;

public class User {
    private String token;
    private TypeOfUser typeOfUser;

    public User() {

    }

    public TypeOfUser getTypeOfUser() {
        return typeOfUser;
    }

    public void setTypeOfUser(TypeOfUser typeOfUser) {
        this.typeOfUser = typeOfUser;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
