package com.example.restaurantfinder.model;

import com.example.restaurantfinder.model.enums.TypeOfUser;

public class AppUser {

    private String bearerToken;
    private TypeOfUser typeOfUser;

    public AppUser(String bearerToken, TypeOfUser typeOfUser) {
        this.bearerToken = bearerToken;
        this.typeOfUser = typeOfUser;
    }

    public String getBearerToken() {
        return bearerToken;
    }

    public void setBearerToken(String bearerToken) {
        this.bearerToken = bearerToken;
    }

    public TypeOfUser getTypeOfUser() {
        return typeOfUser;
    }

    public void setTypeOfUser(TypeOfUser typeOfUser) {
        this.typeOfUser = typeOfUser;
    }
}
