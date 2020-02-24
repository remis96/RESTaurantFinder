package com.example.restaurantfinder.model.pojo_classes;

import com.example.restaurantfinder.enums.PriceClass;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Review {

    @SerializedName("id")
    @Expose(serialize = false)
    private Long id;

    @SerializedName("text")
    private String text;

    @SerializedName("priceClass")
    private PriceClass priceClass;

    @SerializedName("rating")
    private Double rating;

    @SerializedName("dateOfPosting")
    private String dateOfPosting;

    @SerializedName("hidden")
    private Boolean hidden;

    @SerializedName("nameOfUser")
    @Expose(serialize = false)
    private String nameOfUser;

    @SerializedName("reviewEvaluations")
    @Expose(serialize = false)
    private List<ReviewEvaluation> reviewEvaluations = null;

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

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getDateOfPosting() {
        return dateOfPosting;
    }

    public void setDateOfPosting(String dateOfPosting) {
        this.dateOfPosting = dateOfPosting;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public String getNameOfUser() {
        return nameOfUser;
    }

    public void setNameOfUser(String nameOfUser) {
        this.nameOfUser = nameOfUser;
    }

    public List<ReviewEvaluation> getReviewEvaluations() {
        return reviewEvaluations;
    }

    public void setReviewEvaluations(List<ReviewEvaluation> reviewEvaluations) {
        this.reviewEvaluations = reviewEvaluations;
    }
}
