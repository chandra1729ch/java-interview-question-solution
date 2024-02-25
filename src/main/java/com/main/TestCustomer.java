package com.main;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class TestCustomer {
    public static void main(String[] args) {
        Customer cust1 = new Customer(1, true, 12.00);
        Customer cust2 = new Customer(2, false, 123.00);
        Customer cust3 = new Customer(3, true, 145.10);
        Customer cust4 = new Customer(4, false, 176.00);
        Customer cust5 = new Customer(5, true, 56.50);
        List<Customer> customers = new ArrayList<>();
        customers.add(cust1);
        customers.add(cust2);
        customers.add(cust3);
        customers.add(cust4);
        customers.add(cust5);

        Map<Boolean,Long> booleanLongMap= customers.stream().collect(Collectors.groupingBy(Customer::getActive, Collectors.counting()));
        System.out.println(booleanLongMap);
        Map<Boolean, Double>  booleanDOubleMap = customers.stream().collect(Collectors.groupingBy(Customer::getActive, Collectors.averagingDouble(Customer::getBillingCount)));
        System.out.println(booleanDOubleMap);

        DoubleSummaryStatistics summaryActive = customers.stream()
                .filter(Customer::getActive)
                .mapToDouble(Customer::getBillingCount)
                .summaryStatistics();

        double sumActive  = summaryActive.getCount();
        double averageActive = summaryActive.getAverage();
        System.out.println(sumActive);
        System.out.println(averageActive);

        DoubleStream doubleStream = customers.stream()
                .filter(Customer::getActive)
                .mapToDouble(Customer::getBillingCount);
        System.out.println(doubleStream);
    }
}

class Customer {
    private Integer id;
    private Boolean isActive;
    private Double billingCount;

    public Customer(Integer id, Boolean isActive, Double billingCount) {
        this.id = id;
        this.isActive = isActive;
        this.billingCount = billingCount;
    }

    public Double getBillingCount() {
        return billingCount;
    }

    public void setBillingCount(Double billingCount) {
        this.billingCount = billingCount;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}