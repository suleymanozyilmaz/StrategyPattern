package com.suleyman.shopping;

import com.suleyman.strategy.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items;

    public ShoppingCart() {
        this.items= new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public void getEmptyCart(Item item){
        this.items.removeAll(items);
    }

    public double calculateCart(){
        double totalPrice = 0;
        for(Item item: items){
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
    public void checkout(PaymentStrategy paymentStrategy){
        double totalAmount = calculateCart();
        paymentStrategy.pay(totalAmount);
        }
    }

