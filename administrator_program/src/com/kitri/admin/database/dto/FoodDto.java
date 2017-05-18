package com.kitri.admin.database.dto;

public class FoodDto {
    private int foodNum;
    private String foodName;
    private int foodTypeNum;
    private int foodLeftNum;
    private int foodPrice;
    private String foodOrder;

    public int getFoodNum() {
	return foodNum;
    }

    public void setFoodNum(int foodNum) {
	this.foodNum = foodNum;
    }

    public String getFoodName() {
	return foodName;
    }

    public void setFoodName(String foodName) {
	this.foodName = foodName;
    }

    public int getFoodTypeNum() {
	return foodTypeNum;
    }

    public void setFoodTypeNum(int foodTypeNum) {
	this.foodTypeNum = foodTypeNum;
    }

    public int getFoodLeftNum() {
	return foodLeftNum;
    }

    public void setFoodLeftNum(int foodLeftNum) {
	this.foodLeftNum = foodLeftNum;
    }

    public int getFoodPrice() {
	return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
	this.foodPrice = foodPrice;
    }

    public String getFoodOrder() {
	return foodOrder;
    }

    public void setFoodOrder(String foodOrder) {
	this.foodOrder = foodOrder;
    }

}