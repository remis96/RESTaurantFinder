package com.example.restaurantfinder.utils;

import com.example.restaurantfinder.model.Restaurant;
import com.example.restaurantfinder.model.pojo.MultipleResource;
import com.example.restaurantfinder.model.pojo.User;
import com.example.restaurantfinder.model.pojo.UserList;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
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

    @POST("/restaurants/add")
    Call<ResponseBody> addRestaurant(@Body Restaurant restaurant);
}
