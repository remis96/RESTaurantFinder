package com.example.restaurantfinder.utils;


import com.example.restaurantfinder.model.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestApiRestaurantConnector extends RestApiConnector {

    public RestApiRestaurantConnector() {
    }
    //todo post, get, patch, delete api calls

    //restaurants
    public List<Restaurant> getRestaurants() {
        List<Restaurant> restaurants = new ArrayList<>();
        return restaurants;

    }

    public List<Restaurant> getRestaurantById(int id) {
        List<Restaurant> restaurants = new ArrayList<>();
        return restaurants;
    }

    public List<Restaurant> getRestaurantsInDistance(double longitude, double latitude) {
        List<Restaurant> restaurants = new ArrayList<>();
        return restaurants;
    }

    public void addRestaurant(Restaurant restaurant) {

    }

}
