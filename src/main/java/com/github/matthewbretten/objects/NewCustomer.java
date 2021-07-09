package com.github.matthewbretten.objects;

import com.github.matthewbretten.Customer;
import com.github.matthewbretten.data.Customers;

public class NewCustomer {

    public static Customer getCustomer(){
        Customer.CustomerBuilder customerBuilder = Customer.builder();

        Customer randomCustomer = Customers.getCustomer();

        customerBuilder.name(randomCustomer.name);
        customerBuilder.countryCode(randomCustomer.countryCode);
        customerBuilder.age(randomCustomer.age);

        return customerBuilder.build();
    }
}
