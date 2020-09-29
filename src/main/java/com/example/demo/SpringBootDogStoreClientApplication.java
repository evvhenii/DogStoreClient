package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.prog.methods.*;
import java.util.Scanner;

@SpringBootApplication
public class SpringBootDogStoreClientApplication {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Демонстрація роботи:\n");
		
		CashRegisterMethods cashReg = new CashRegisterMethods();
		CashierMethods cashier = new CashierMethods();
		DogMethods dog = new DogMethods();
		ForDogsMethods forDog = new ForDogsMethods();
		
		cashReg.createCashRegister();
		cashier.createCashier();
		dog.createDogs();
		
		cashReg.cashRegisterReport();
		cashier.cashierReport();
		dog.dogsReport();
		
		System.out.println("Please, enter ID of cash register youre working at:");
		String cashRegisterId = in.nextLine();
		
		System.out.println("Please, enter ID of dog you want to sell for customer:");
		String dogId = in.nextLine();
		
		dog.sellDog(cashRegisterId, dogId);
		System.out.println("Money were added:");
		cashReg.cashRegisterReport();
		
		System.out.println("Please, enter ID of accessory you want to sell for customer:");
		String forDogId = in.nextLine();
		
		forDog.sellForDog(cashRegisterId, forDogId);
		System.out.println("Money were added:");
		cashReg.cashRegisterReport();
	}

}
