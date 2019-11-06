package com.training;

public class Application {

	
	public static void main(String[] args) {
		FoodOrder order1 = new FoodOrder("Chicken Momos", "Starter");
		
		System.out.println(order1.getFoodName());
	}
}
