package com.master.serviceb.model;

import java.io.Serializable;

public class HouseDo implements Serializable {

    /** 主键 */
    private Long id;

    /**  */
    private String title;

    /**  */
    private String price;

    /**  */
    private String aroundPrice;

    /**  */
    private String houseType;

    /**  */
    private String address;

    /**  */
    private String phone;

    /**  */
    private String opentime;

    /**  */
    private String completetime;

    /**  */
    private String url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAroundPrice() {
        return aroundPrice;
    }

    public void setAroundPrice(String aroundPrice) {
        this.aroundPrice = aroundPrice;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOpentime() {
        return opentime;
    }

    public void setOpentime(String opentime) {
        this.opentime = opentime;
    }

    public String getCompletetime() {
        return completetime;
    }

    public void setCompletetime(String completetime) {
        this.completetime = completetime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
