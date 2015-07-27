package com.sadman.dto;

/**
 * Created by Sadman on 7/24/2015.
 */
public class ProductDto {

    private int id;
    private int categoryId;
    private int subCategoryId;
    private int storeId;
    private String name;
    private String description;
    private double price;
    private String imageUrl;
    private int available;
    private String uploadDateTime;
    private int ratings;
    private int view;
    private int order;
    private double sale;
    private int review;
    private int cartTimeLimit;
    private int fraud;
    private String storeName;
    private int storeRatings;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(int subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public String getUploadDateTime() {
        return uploadDateTime;
    }

    public void setUploadDateTime(String uploadDateTime) {
        this.uploadDateTime = uploadDateTime;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }

    public int getCartTimeLimit() {
        return cartTimeLimit;
    }

    public void setCartTimeLimit(int cartTimeLimit) {
        this.cartTimeLimit = cartTimeLimit;
    }

    public int getFraud() {
        return fraud;
    }

    public void setFraud(int fraud) {
        this.fraud = fraud;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getStoreRatings() {
        return storeRatings;
    }

    public void setStoreRatings(int storeRatings) {
        this.storeRatings = storeRatings;
    }

}
