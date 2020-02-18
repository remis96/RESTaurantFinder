package com.example.restaurantfinder.model;

public class ExceptionDate {

    private Integer dayOfMonth;

    private Integer monthOfYear;

    private Integer year;

    private Integer openingHour;

    private Integer openingMinute;

    private Integer closingMinute;

    private Integer closingHour;

    private Boolean closed;

    public ExceptionDate() {
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
