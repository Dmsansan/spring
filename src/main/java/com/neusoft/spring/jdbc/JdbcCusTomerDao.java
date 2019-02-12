package com.neusoft.spring.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcCusTomerDao implements CusTomerDao {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insert(Customer customer){

        String sql = "INSERT INTO CUSTOMER " +
                "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        jdbcTemplate.update(sql, new Object[] {customer.getCust_Id(),customer.getName()
                ,customer.getAge()});
//        Connection conn = null;
//
//        try {
//            conn = dataSource.getConnection();
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setInt(1, customer.getCust_Id());
//            ps.setString(2, customer.getName());
//            ps.setInt(3, customer.getAge());
//            ps.executeUpdate();
//            ps.close();
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//
//        } finally {
//            if (conn != null) {
//                try {
//                    conn.close();
//                } catch (SQLException e) {}
//            }
//        }
    }

    public Customer findByCustomerId(int custId){

        String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";

        Connection conn = null;

        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, custId);
            Customer customer = null;
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                customer = new Customer(
                        rs.getInt("CUST_ID"),
                        rs.getString("NAME"),
                        rs.getInt("Age")
                );
            }
            rs.close();
            ps.close();
            return customer;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }
}
