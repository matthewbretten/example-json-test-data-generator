package com.github.matthewbretten.data;

import com.github.matthewbretten.Customer;

import java.util.ArrayList;
import java.util.Random;

public class Customers {

    private static ArrayList<Customer> customers = new ArrayList<Customer>(){{
        add(Customer.builder().name("Billy Boat").age(23).countryCode("GB").build());
        add(Customer.builder().name("Martin Smith").age(18).countryCode("GB").build());
        add(Customer.builder().name("Bob Hope").age(47).countryCode("GB").build());
        add(Customer.builder().name("Catherine Wheel").age(25).countryCode("GB").build());
        add(Customer.builder().name("Sarah Brown").age(56).countryCode("GB").build());
        add(Customer.builder().name("Julian Smith").age(20).countryCode("GB").build());
        add(Customer.builder().name("Dave Brundle").age(67).countryCode("GB").build());
    }};

    public static Customer getCustomer(){
        Random random = new Random();
        return customers.get(random.nextInt(customers.size()));
    }
}
