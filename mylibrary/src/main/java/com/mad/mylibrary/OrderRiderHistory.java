package com.mad.mylibrary;

public class OrderRiderHistory {
    private String keyRestaurant;
    private String keyCustomer;
    private Long time;
    private Integer status;

    public OrderRiderHistory() {

    }

    public OrderRiderHistory(String keyRestaurant, String keyCustomer, Long time, Integer status) {
        this.keyRestaurant = keyRestaurant;
        this.keyCustomer = keyCustomer;
        this.time = time;
        this.status = status;
    }

    public String getKeyRestaurant() {
        return keyRestaurant;
    }

    public String getKeyCustomer() {
        return keyCustomer;
    }

    public Long getTime() {
        return time;
    }

    public Integer getStatus() {return status;}

    public void setStatus(Integer status){
        this.status = status;
    }
}
