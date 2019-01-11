package com.neusoft.spring.jdbc;

public class Customer {
    int cust_Id;
    String name;
    int age;

    public Customer(int cust_id, String name, int age) {
        this.cust_Id = cust_id;
        this.name = name;
        this.age = age;
    }

    public int getCust_Id() {
        return cust_Id;
    }
    public void setCust_Id(int cust_Id) {
        this.cust_Id = cust_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
