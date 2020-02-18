package com.example.restaurantfinder.model;

import com.example.restaurantfinder.enums.PriceClass;

import java.util.Date;
import java.util.Set;

public class Review {

    private Long id;
    private String text;
    private PriceClass priceClass;
    private Float rating;
    private Date dateOfPosting;
    private boolean hidden;
    private String user; //dat prec
    private Restaurant restaurant;
    private String nameOfUser;
    private Set<ReviewEvaluation> reviewEvaluations;

    public Review() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public PriceClass getPriceClass() {
        return priceClass;
    }

    public void setPriceClass(PriceClass priceClass) {
        this.priceClass = priceClass;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public Date getDateOfPosting() {
        return dateOfPosting;
    }

    public void setDateOfPosting(Date dateOfPosting) {
        this.dateOfPosting = dateOfPosting;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public String getNameOfUser() {
        return nameOfUser;
    }

    public void setNameOfUser(String nameOfUser) {
        this.nameOfUser = nameOfUser;
    }

    public Set<ReviewEvaluation> getReviewEvaluations() {
        return reviewEvaluations;
    }

    public void setReviewEvaluations(Set<ReviewEvaluation> reviewEvaluations) {
        this.reviewEvaluations = reviewEvaluations;
    }
}
