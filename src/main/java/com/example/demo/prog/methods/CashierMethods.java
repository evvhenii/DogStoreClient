package com.example.demo.prog.methods;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.demo.models.work.CashRegister;

public class CashierMethods {
	public void createCashier() {
        String address = "http://localhost:8080/cashiers/";
        RestTemplate restTempl = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("name", "Anna");
        System.out.println("New cashier was added!");
        HttpEntity<CashRegister> response = restTempl.exchange(builder.toUriString(), 
        		HttpMethod.POST, null, CashRegister.class);
        System.out.println(response.getBody());
        
        builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("name", "Anton");
        System.out.println("New cashier was added!");
        response = restTempl.exchange(builder.toUriString(), 
        		                      HttpMethod.POST, null, CashRegister.class);
        System.out.println(response.getBody());
    }

    public void cashierReport() {
    	String address = "http://localhost:8080/cashiers/";
        RestTemplate restTempl = new RestTemplate();
        System.out.println("CASHIERS REPORT:");

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address);

        HttpEntity<String> response = restTempl.exchange(builder.toUriString(),
                HttpMethod.GET, null, String.class);
        System.out.println(response.getBody());
    }
}
