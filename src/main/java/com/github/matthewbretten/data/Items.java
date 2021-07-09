package com.github.matthewbretten.data;

import com.github.matthewbretten.Item;

import java.util.ArrayList;
import java.util.Random;

public class Items {

    private static ArrayList<Item> items = new ArrayList<Item>(){{
        add(Item.builder().basketItemId(1).description("Bananas").price(1).build());
        add(Item.builder().basketItemId(2).description("Television").price(500).build());
        add(Item.builder().basketItemId(3).description("T shirt").price(3).build());
        add(Item.builder().basketItemId(4).description("Mug").price(5).build());
        add(Item.builder().basketItemId(5).description("Kindle").price(120).build());
        add(Item.builder().basketItemId(6).description("Shoes").price(50).build());
        add(Item.builder().basketItemId(7).description("Jeans").price(20).build());
    }};

    public static Item getItem(){
        Random random = new Random();
        return items.get(random.nextInt(items.size()));
    }
}
