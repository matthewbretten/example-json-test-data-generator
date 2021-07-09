package com.github.matthewbretten.data;

import java.util.Random;

public class Number {

    private static int randomFromRange(int from, int to){
        Random random = new Random();
        return random.nextInt((to - from)+1)+from;
    }

    public static int getRandomFromRange(int from, int to) { return randomFromRange(from, to); }
}
