package com.example.OrderStock.bo;

import com.example.OrderStock.entity.StockEntity;
import java.util.List;

public class AccountResponse {

    private List<StockEntity> stock;

    private String message;

    public AccountResponse(List<StockEntity> stock, String message) {
        this.stock = stock;
        this.message = message;
    }

    public List<StockEntity> getStock() {
        return stock;
    }

    public void setStock(List<StockEntity> stock) {
        this.stock = stock;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
