package com.example.restaurantfinder.model.pojo_classes;

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
    private Float priceClass;

    @SerializedName("rating")
    private Float rating;

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

    public Float getPriceClass() {
        return priceClass;
    }

    public void setPriceClass(Float priceClass) {
        this.priceClass = priceClass;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
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
