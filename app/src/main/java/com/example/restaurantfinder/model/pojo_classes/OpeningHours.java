package com.example.restaurantfinder.model.pojo_classes;

import com.example.restaurantfinder.model.enums.DAY;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OpeningHours {

    @SerializedName("id")
    @Expose(serialize = false)
    private Long id;

    @SerializedName("openHour")
    private Integer openHour;

    @SerializedName("openMinute")
    private Integer openMinute;

    @SerializedName("closeHour")
    private Integer closeHour;

    @SerializedName("closeMinute")
    private Integer closeMinute;

    @SerializedName("dayOfWeek")
    private DAY dayOfWeek;

    @SerializedName("closed")
    private Boolean closed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOpenHour() {
        return openHour;
    }

    public void setOpenHour(Integer openHour) {
        this.openHour = openHour;
    }

    public Integer getOpenMinute() {
        return openMinute;
    }

    public void setOpenMinute(Integer openMinute) {
        this.openMinute = openMinute;
    }

    public Integer getCloseHour() {
        return closeHour;
    }

    public void setCloseHour(Integer closeHour) {
        this.closeHour = closeHour;
    }

    public Integer getCloseMinute() {
        return closeMinute;
    }

    public void setCloseMinute(Integer closeMinute) {
        this.closeMinute = closeMinute;
    }

    public DAY getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DAY dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }


}
