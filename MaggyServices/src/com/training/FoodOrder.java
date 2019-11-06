package com.training;

public class FoodOrder {
	private String foodName;
	private String category;
	public FoodOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FoodOrder(String foodName, String category) {
		super();
		this.foodName = foodName;
		this.category = category;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
