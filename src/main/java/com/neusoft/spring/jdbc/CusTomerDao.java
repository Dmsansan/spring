package com.neusoft.spring.jdbc;

public interface CusTomerDao {
    public void  insert(Customer customer);
    public Customer findByCustomerId(int custId);
}
