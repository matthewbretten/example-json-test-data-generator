package com.github.matthewbretten.objects;

import com.github.matthewbretten.Basket;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasketTest {

    @Test
    public void toJson(){
        NewBasket newBasket = new NewBasket();
        Basket basket = newBasket.getBasket();

        System.out.println(basket.toJson(false));

        int expectedTotalPrice = 0;
        for (int i =0; i < basket.items.size();i++){
            int price = basket.items.get(i).price;
            expectedTotalPrice = expectedTotalPrice + price;
        }
        int actualTotalPrice = basket.totalPrice;

        assertEquals(expectedTotalPrice,actualTotalPrice);
    }
}
