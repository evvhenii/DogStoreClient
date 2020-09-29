package com.example.demo.models.goods;

import java.util.UUID;

import com.example.demo.models.enums.*;

public final class ForDog{
	private String forDogId;
	private Type type;
	private Color color;
	private int price;

	public ForDog() {}
	
	public ForDog(Type type, Color color, int price){
		this.forDogId = UUID.randomUUID().toString();
		this.type = type;
		this.color = color;
		this.price = price;
	}
	
	public String getForDogId() {
		return forDogId;
	}
	
	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return type + " " + color + ". PRICE: " + price + "Hryvnia. ID " + forDogId;
	}

}
