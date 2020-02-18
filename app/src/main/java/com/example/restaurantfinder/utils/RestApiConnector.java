package com.example.restaurantfinder.utils;

public class RestApiConnector {
    private static final String URL = "http://10.0.2.2:8080/";

    public RestApiConnector() {
    }

    public static String getURL() {
        return URL;
    }
}
