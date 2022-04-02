package com.suleyman.strategy;

public class TransferStrategy implements PaymentStrategy{

    private String name;
    private String ibanNumber;

    public TransferStrategy(String name, String ibanNumber) {
        this.name = name;
        this.ibanNumber = ibanNumber;
    }

    @Override
    public void pay(double pay) {
        pay *= 0.95;
        System.out.println(pay + " paid with transfer. Thank's for your Purchase\n");
    }
}
