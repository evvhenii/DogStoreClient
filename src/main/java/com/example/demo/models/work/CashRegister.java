package com.example.demo.models.work;

import java.util.UUID;

public final class CashRegister {
	private String id;
	private String name;
	private int amountOfCash;
	
	public CashRegister() {}
	
	public CashRegister(String name, int amountOfCash){
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.amountOfCash = amountOfCash;
	}

	public int getAmountOfCash() {
		return amountOfCash;
	}

	public void setAmountOfCash(int amount) {
		this.amountOfCash = amount;
		System.out.println("In the cash register \"" + name + "\" " + amount + " Hryvnia");
	}
	
	@Override
	public String toString() {
		return "In the cash register " + name + " " + amountOfCash + " Hryvnia. ID " + id;
	}
}
