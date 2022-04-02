package com.suleyman.test;

import com.suleyman.shopping.Item;
import com.suleyman.shopping.ShoppingCart;
import com.suleyman.strategy.DoorPaymentStrategy;
import com.suleyman.strategy.PaymentStrategy;

public class ShoppingCartTest {

    public static void main(String[] args){
        ShoppingCart myCart = new ShoppingCart();

        Item bread = new Item("112233", 3.0);
        Item egg = new Item("192837",40.0);
        Item cheese = new Item("321576",25.0);



        myCart.addItem(egg);;
        myCart.addItem(cheese);

        myCart.checkout(new DoorPaymentStrategy());
    }
}
