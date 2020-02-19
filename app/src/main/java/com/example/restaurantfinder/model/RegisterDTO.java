package com.example.restaurantfinder.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RegisterDTO {
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("mailAdress")
    @Expose
    private String mailAdress;
    @SerializedName("typeOfUser")
    @Expose
    private String typeOfUser;

    public RegisterDTO(String username, String password, String mailAdress, String typeOfUser) {
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

    public String getTypeOfUser() {
        return typeOfUser;
    }

    public void setTypeOfUser(String typeOfUser) {
        this.typeOfUser = typeOfUser;
    }

}
