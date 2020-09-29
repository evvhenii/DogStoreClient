package com.example.demo.prog.methods;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.demo.models.work.CashRegister;

public class CashRegisterMethods {
	public void createCashRegister() {
        String address = "http://localhost:8080/cashregisters/";
        RestTemplate restTempl = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("name", "Cash_registeR").
                queryParam("amountOfCash", 1);
        System.out.println("New cash register was added!");
        HttpEntity<CashRegister> response = restTempl.exchange(builder.toUriString(), 
        		HttpMethod.POST, null, CashRegister.class);
        System.out.println(response.getBody());
    }

    public void cashRegisterReport() {
    	String address = "http://localhost:8080/cashregisters/";
        RestTemplate restTempl = new RestTemplate();
        System.out.println("CASH_REGISTERS REPORT:");

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address);

        HttpEntity<String> response = restTempl.exchange(builder.toUriString(),
                HttpMethod.GET, null, String.class);
        System.out.println(response.getBody());
    }
}
