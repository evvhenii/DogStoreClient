package com.example.demo.prog.methods;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.demo.models.enums.Breed;
import com.example.demo.models.work.CashRegister;

public class DogMethods {
	public void createDogs() {
        String address = "http://localhost:8080/dogs/";
        RestTemplate restTempl = new RestTemplate();

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("breed", Breed.POODLE).
                queryParam("name", "Max").
                queryParam("description", "A_little_dog").
                queryParam("price", 780);
        System.out.println("New dog was added!");
        HttpEntity<CashRegister> response = restTempl.exchange(builder.toUriString(), 
        		HttpMethod.POST, null, CashRegister.class);
        System.out.println(response.getBody());
        
        builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("breed", Breed.RETRIEVER).
                queryParam("name", "Lena").
                queryParam("description", "A_dog").
                queryParam("price", 780);
        System.out.println("New dog was added!");
        response = restTempl.exchange(builder.toUriString(), 
        		HttpMethod.POST, null, CashRegister.class);
        System.out.println(response.getBody());
        
        builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("breed", Breed.TERRIER).
                queryParam("name", "Miiz").
                queryParam("description", "A big dog").
                queryParam("price", 1360);
        System.out.println("New dog was added!");
        response = restTempl.exchange(builder.toUriString(), 
        		HttpMethod.POST, null, CashRegister.class);
        System.out.println(response.getBody());
        
        builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("breed", Breed.POODLE).
                queryParam("name", "Max").
                queryParam("description", "A_little_dog").
                queryParam("price", 780);
        System.out.println("New dog was added!");
        response = restTempl.exchange(builder.toUriString(), 
        		HttpMethod.POST, null, CashRegister.class);
        System.out.println(response.getBody());
        
        builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("breed", Breed.HUSKIE).
                queryParam("name", "Vera").
                queryParam("description", "A_midle_dog").
                queryParam("price", 440);
        System.out.println("New dog was added!");
        response = restTempl.exchange(builder.toUriString(), 
        		HttpMethod.POST, null, CashRegister.class);
        System.out.println(response.getBody());
    }

    public void dogsReport() {
    	String address = "http://localhost:8080/dogs/";
        RestTemplate restTempl = new RestTemplate();
        System.out.println("DOGS REPORT:");

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address);

        HttpEntity<String> response = restTempl.exchange(builder.toUriString(),
                HttpMethod.GET, null, String.class);
        System.out.println(response.getBody());
    }
    
    public void sellDog(String cashRegisterId, String dogId) {
        String address = "http://localhost:8080/dogs";
        RestTemplate restTempl = new RestTemplate();
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(address).
                queryParam("cashRegisterId", cashRegisterId).
                queryParam("dogId", dogId);
        HttpEntity<String> response = restTempl.exchange(builder.toUriString(), HttpMethod.DELETE, null, String.class);
        System.out.println(response.getBody());
    }
}
