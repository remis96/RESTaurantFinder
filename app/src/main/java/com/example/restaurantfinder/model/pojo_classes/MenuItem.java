package com.example.restaurantfinder.model.pojo_classes;

import com.example.restaurantfinder.enums.MenuItemType;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MenuItem {

    @SerializedName("itemType")
    private MenuItemType itemType;

    @SerializedName("price")
    private Double price;

    @SerializedName("description")
    private String description;

    @SerializedName("id")
    @Expose(serialize = false)
    private Long id;

    public MenuItemType getItemType() {
        return itemType;
    }

    public void setItemType(MenuItemType itemType) {
        this.itemType = itemType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
