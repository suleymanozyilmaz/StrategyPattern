package com.suleyman.strategy;

public class DoorPaymentStrategy implements PaymentStrategy{


    @Override
    public void pay(double pay) {
        pay += 15;
        System.out.println(pay + " paid with door payment. Thank's for your purchase\n");
    }
}
