package io.spring.cloud.partition.domain;

public class Customer {
    private int id;
    public Customer(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
}
