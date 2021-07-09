package com.github.matthewbretten.objects;

import com.github.matthewbretten.Item;
import com.github.matthewbretten.data.Items;

import java.util.ArrayList;

public class NewListOfItems {

    public static ArrayList<Item> getListOfItems(int numOfItems){
        ArrayList<Item> itemList = new ArrayList<>();

        for(int i =0; i < numOfItems; i++){
            Item item = getItem();
            itemList.add(item);
        }

        return itemList;
    }

    private static Item getItem(){
        Item.ItemBuilder itemBuilder = Item.builder();

        Item randomItem = Items.getItem();

        itemBuilder.basketItemId(randomItem.basketItemId);
        itemBuilder.description(randomItem.description);
        itemBuilder.price(randomItem.price);

        return itemBuilder.build();
    }
}
