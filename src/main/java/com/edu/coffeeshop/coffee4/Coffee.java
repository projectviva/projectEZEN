package com.edu.coffeeshop.coffee4;

public class Coffee {
	private HotAmericano ame;
	
	public Coffee() {
		ame = new HotAmericano();
	}
	public void CoffeeType() {
		System.out.println(ame.getName());
	}
}
