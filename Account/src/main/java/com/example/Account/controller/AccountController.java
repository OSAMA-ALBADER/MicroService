package com.example.Account.controller;

import com.example.Account.bo.AccountResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
@RequestMapping("/api")
public class AccountController {
    private final RestTemplate restTemplate;

    private static final String STOCK_API = "http://localhost:8080/api/getAllItems";

    public AccountController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // By accessing this URL, the Account application calls the STOCK_API URL.
    // Meaning, this application will call the OrderStock application to get all stock
    @GetMapping("/account")
    public AccountResponse allStock(){
        ResponseEntity<AccountResponse> responseEntity = restTemplate.getForEntity(STOCK_API, AccountResponse.class);
        responseEntity.getBody().setStatus("Success!");
        return responseEntity.getBody();
    }
}
