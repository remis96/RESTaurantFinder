package com.example.restaurantfinder.model.pojo_classes;

import com.example.restaurantfinder.model.enums.PriceClass;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Restaurant {

    @SerializedName("priceClass")
    private PriceClass priceClass;

    @SerializedName("id")
    @Expose(serialize = false)
    private Long id;

    @SerializedName("phoneNumber")
    private Integer phoneNumber;

    @SerializedName("name")
    private String name;

    @SerializedName("city")
    private String city;

    @SerializedName("state")
    private String state;

    @SerializedName("street")
    private Object street;

    @SerializedName("longitude")
    private Double longitude;

    @SerializedName("latitude")
    private Double latitude;

    @SerializedName("hidden")
    private Boolean hidden;

    @SerializedName("menuItems")
    @Expose(serialize = false)
    private List<Object> menuItems = null;

    @SerializedName("reviews")
    @Expose(serialize = false)
    private List<Object> reviews = null;

    @SerializedName("openingHours")
    @Expose(serialize = false)
    private List<OpeningHours> openingHours = null;

    @SerializedName("exceptionDates")
    @Expose(serialize = false)
    private List<Object> exceptionDates = null;

    public PriceClass getPriceClass() {
        return priceClass;
    }

    public void setPriceClass(PriceClass priceClass) {
        this.priceClass = priceClass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Object getStreet() {
        return street;
    }

    public void setStreet(Object street) {
        this.street = street;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public List<Object> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<Object> menuItems) {
        this.menuItems = menuItems;
    }

    public List<Object> getReviews() {
        return reviews;
    }

    public void setReviews(List<Object> reviews) {
        this.reviews = reviews;
    }

    public List<OpeningHours> getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(List<OpeningHours> openingHours) {
        this.openingHours = openingHours;
    }

    public List<Object> getExceptionDates() {
        return exceptionDates;
    }

    public void setExceptionDates(List<Object> exceptionDates) {
        this.exceptionDates = exceptionDates;
    }

}
