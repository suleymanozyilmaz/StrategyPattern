package com.suleyman.strategy;

public class CreditCardStrategy implements PaymentStrategy{
     private String ownerName;
     private String cardNumber;
     private String cvv;
     private String expiryDate;

    public CreditCardStrategy(String ownerName, String cardNumber, String cvv, String expiryDate) {
        this.ownerName = ownerName;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(double pay) {
        System.out.println(pay + " paid with the credit card. Thank You for your purchase\n");

    }
}
