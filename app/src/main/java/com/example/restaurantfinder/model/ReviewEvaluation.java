package com.example.restaurantfinder.model;

public class ReviewEvaluation {

    private Long id;
    private Boolean helped;
    private Review review;
    private String nameOfUser;

    public ReviewEvaluation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getHelped() {
        return helped;
    }

    public void setHelped(Boolean helped) {
        this.helped = helped;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public String getNameOfUser() {
        return nameOfUser;
    }

    public void setNameOfUser(String nameOfUser) {
        this.nameOfUser = nameOfUser;
    }
}
