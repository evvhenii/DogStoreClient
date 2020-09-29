package com.example.demo.prog.methods;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.demo.models.enums.Color;
import com.example.demo.models.enums.Type;
import com.example.demo.models.work.CashRegister;

public class ForDogsMethods {
	public void createForDogs() {
        String address = "http://localhost:8080/fordogs/";
        RestTemplate restTempl = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("type", Type.HOUSE).
                queryParam("color", Color.BLACK).
                queryParam("price", 220);
        System.out.println("New dog was added!");
        HttpEntity<CashRegister> response = restTempl.exchange(builder.toUriString(), 
        		HttpMethod.POST, null, CashRegister.class);
        System.out.println(response.getBody());
        
        builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("type", Type.HOUSE).
                queryParam("color", Color.RED).
                queryParam("price", 470);
        System.out.println("New dog was added!");
        response = restTempl.exchange(builder.toUriString(), 
        		HttpMethod.POST, null, CashRegister.class);
        System.out.println(response.getBody());
        
        builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("type", Type.LEASH).
                queryParam("color", Color.BLUE).
                queryParam("price", 1360);
        System.out.println("New dog was added!");
        response = restTempl.exchange(builder.toUriString(), 
        		HttpMethod.POST, null, CashRegister.class);
        System.out.println(response.getBody());
        
        builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("type", Type.FEED).
                queryParam("color", Color.GREEN).
                queryParam("price", 998);
        System.out.println("New dog was added!");
        response = restTempl.exchange(builder.toUriString(), 
        		HttpMethod.POST, null, CashRegister.class);
        System.out.println(response.getBody());
        
        builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("type", Type.FEED).
                queryParam("color", Color.BLUE).
                queryParam("price", 630);
        System.out.println("New dog was added!");
        response = restTempl.exchange(builder.toUriString(), 
        		HttpMethod.POST, null, CashRegister.class);
        System.out.println(response.getBody());
    }

    public void forDogsReport() {
    	String address = "http://localhost:8080/fordogs/";
        RestTemplate restTempl = new RestTemplate();
        System.out.println("ACCESSORIES REPORT:");

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address);

        HttpEntity<String> response = restTempl.exchange(builder.toUriString(),
                HttpMethod.GET, null, String.class);
        System.out.println(response.getBody());
    }
    
    public void sellForDog(String cashRegisterId, String forDogId) {
        String address = "http://localhost:8080/fordogs";
        RestTemplate restTempl = new RestTemplate();
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("cashRegisterId", cashRegisterId).
                queryParam("dogId", forDogId);
        HttpEntity<String> response = restTempl.exchange(builder.toUriString(), HttpMethod.DELETE, null, String.class);
        System.out.println(response.getBody());
    }
}
