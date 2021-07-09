package com.github.matthewbretten.objects;

import com.github.matthewbretten.Basket;
import com.github.matthewbretten.Item;
import com.github.matthewbretten.data.DateTime;
import com.github.matthewbretten.data.Number;

import java.util.ArrayList;

public class NewBasket {

    public static Basket getBasket(){
        Basket.BasketBuilder basketBuilder = Basket.builder();

        ArrayList<Item> itemList = NewListOfItems.getListOfItems(Number.getRandomFromRange(1,10));

        int totalPrice = 0;
        for (int i =0; i < itemList.size();i++){
            int price = itemList.get(i).price;
            totalPrice = totalPrice + price;
        }

        basketBuilder.customer(NewCustomer.getCustomer());
        basketBuilder.items(itemList);
        basketBuilder.totalPrice(totalPrice);
        basketBuilder.dateCreated(DateTime.getCurrentDate());

        return basketBuilder.build();
    }
}
