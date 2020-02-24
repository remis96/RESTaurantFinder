package com.example.restaurantfinder.utils;

import com.example.restaurantfinder.model.pojo_classes.LoginDTO;
import com.example.restaurantfinder.model.pojo_classes.RegisterDTO;
import com.example.restaurantfinder.model.pojo_classes.Restaurant;
import com.example.restaurantfinder.model.pojo.MultipleResource;
import com.example.restaurantfinder.model.pojo.User;
import com.example.restaurantfinder.model.pojo.UserList;
import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface APIInterface {
    @GET("/api/unknown")
    Call<MultipleResource> doGetListResources();

    @POST("/api/users")
    Call<User> createUser(@Body User user);

    @GET("/api/users?")
    Call<UserList> doGetUserList(@Query("page") String page);

    @FormUrlEncoded
    @POST("/api/users?")
    Call<UserList> doCreateUserWithField(@Field("name") String name, @Field("job") String job);

    //restaurants
    @POST("/restaurants/add")
    Call<String> addRestaurant(@Body Restaurant restaurant, @Header("Authorization") String authHeader);

    @GET("/restaurants/getAll")
    Call<List<Restaurant>> getAll(@Header("Authorization") String authHeader);

    //user managment
    @POST("/register")
    Call<RegisterDTO> register(@Body RegisterDTO registerDTO);

    @POST("/authenticate")
    Call<JsonObject> login(@Body LoginDTO loginDTO);
}
