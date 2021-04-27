package com.example.chair;

public class Chairs {
    private String title;
    private int imgChair;
    private String price;
    private String status;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImgChair() {
        return imgChair;
    }

    public void setImgChair(int imgChair) {
        this.imgChair = imgChair;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Chairs(String title, int imgChair, String price, String status) {
        this.title = title;
        this.imgChair = imgChair;
        this.price = price;
        this.status = status;
    }
}
