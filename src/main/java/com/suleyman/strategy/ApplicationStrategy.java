package com.suleyman.strategy;

public class ApplicationStrategy implements PaymentStrategy{

    private String name;
    private String email;
    private String password;

    public ApplicationStrategy(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(double pay) {
        System.out.println(pay + " paid with 3rd party application. Thank you for your purchase.\n");
    }
}
