package com;

public class FoodIntro {
	private String foodname;
           
	
	public FoodIntro(String food) {
		foodname = food;
	}
	
	public String generatefood()
	{
		if( foodname.equals("true") )
		{
			
			return "Pizza is a flatbread generally topped with tomato sauce and cheese and baked in an oven. It is commonly topped with a selection of meats, vegetables and condiments.";
		}
		else
		{
			
			return " ";
		}
	}
}
