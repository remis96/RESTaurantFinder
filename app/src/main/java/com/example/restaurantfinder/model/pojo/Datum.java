package com.example.restaurantfinder.model.pojo;

import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("id")
    public Integer id;
    @SerializedName("name")
    public String name;
    @SerializedName("year")
    public Integer year;
    @SerializedName("pantone_value")
    public String pantoneValue;

}