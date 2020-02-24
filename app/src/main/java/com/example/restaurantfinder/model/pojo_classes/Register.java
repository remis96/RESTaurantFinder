package com.example.restaurantfinder.model.pojo_classes;

import com.example.restaurantfinder.enums.TypeOfUser;
import com.google.gson.annotations.SerializedName;

public class Register {

    @SerializedName("username")
    private String username;
    @SerializedName("password")
    private String password;
    @SerializedName("mailAdress")
    private String mailAdress;
    @SerializedName("typeOfUser")
    private TypeOfUser typeOfUser;

    public Register(String username, String password, String mailAdress, TypeOfUser typeOfUser) {
        this.username = username;
        this.password = password;
        this.mailAdress = mailAdress;
        this.typeOfUser = typeOfUser;
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

    public String getMailAdress() {
        return mailAdress;
    }

    public void setMailAdress(String mailAdress) {
        this.mailAdress = mailAdress;
    }

    public TypeOfUser getTypeOfUser() {
        return typeOfUser;
    }

    public void setTypeOfUser(TypeOfUser typeOfUser) {
        this.typeOfUser = typeOfUser;
    }

}
