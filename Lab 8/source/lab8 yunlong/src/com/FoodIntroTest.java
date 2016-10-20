package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class FoodIntroTest {
       String food = "true";
	   FoodIntro f = new FoodIntro(food);
	   String foodresult = f.generatefood();
	   String foodtest = "Pizza is a flatbread generally topped with tomato sauce and cheese and baked in an oven. It is commonly topped with a selection of meats, vegetables and condiments.";

	
	@Test
	public void testGeneratefood() {
		System.out.println("@Test food: " +  food);
		System.out.println(foodresult + " = " + foodtest);
		assertEquals(foodresult, foodtest);
	}

}


