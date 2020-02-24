package com.example.restaurantfinder.model.pojo_classes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReviewEvaluation {

    @SerializedName("id")
    @Expose(serialize = false)
    private Long id;
    @SerializedName("helped")
    private Boolean helped;

    @SerializedName("nameOfUser")
    @Expose(serialize = false)
    private String nameOfUser;

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

    public String getNameOfUser() {
        return nameOfUser;
    }

    public void setNameOfUser(String nameOfUser) {
        this.nameOfUser = nameOfUser;
    }
}
