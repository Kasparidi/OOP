package ru.netology.domain;

public class Place {
    private int placeId;
    private String title;
    private int created;
    private String icon;
    private int amountCheck;
    private int updatedData;
    private int countryId;
    private int cityId;
    private String address;

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getAmountCheck() {
        return amountCheck;
    }

    public void setAmountCheck(int amountCheck) {
        this.amountCheck = amountCheck;
    }

    public int getUpdatedData() {
        return updatedData;
    }

    public void setUpdatedData(int updatedData) {
        this.updatedData = updatedData;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
