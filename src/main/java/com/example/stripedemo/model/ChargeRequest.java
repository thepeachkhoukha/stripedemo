package com.example.stripedemo.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ChargeRequest {

    public enum Currency {
        EUR, USD;
    }
    private String description;
    private int amount;
    private Currency currency;
    private String stripeEmail;
    private String stripeToken;
}