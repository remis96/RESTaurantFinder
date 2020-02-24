package com.example.restaurantfinder.model.pojo_classes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExceptionDate {

    @SerializedName("id")
    @Expose(serialize = false)
    private Integer id;

    @SerializedName("dayOfMonth")
    private Integer dayOfMonth;

    @SerializedName("monthOfYear")
    private Integer monthOfYear;

    @SerializedName("year")
    private Integer year;

    @SerializedName("openingHour")
    private Integer openingHour;

    @SerializedName("openingMinute")
    private Integer openingMinute;

    @SerializedName("closingMinute")
    private Integer closingMinute;

    @SerializedName("closingHour")
    private Integer closingHour;

    @SerializedName("closed")
    private Boolean closed;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public Integer getMonthOfYear() {
        return monthOfYear;
    }

    public void setMonthOfYear(Integer monthOfYear) {
        this.monthOfYear = monthOfYear;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getOpeningHour() {
        return openingHour;
    }

    public void setOpeningHour(Integer openingHour) {
        this.openingHour = openingHour;
    }

    public Integer getOpeningMinute() {
        return openingMinute;
    }

    public void setOpeningMinute(Integer openingMinute) {
        this.openingMinute = openingMinute;
    }

    public Integer getClosingMinute() {
        return closingMinute;
    }

    public void setClosingMinute(Integer closingMinute) {
        this.closingMinute = closingMinute;
    }

    public Integer getClosingHour() {
        return closingHour;
    }

    public void setClosingHour(Integer closingHour) {
        this.closingHour = closingHour;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }
}
