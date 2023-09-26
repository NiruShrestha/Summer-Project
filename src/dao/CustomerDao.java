/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Customer;


/**
 *
 * @author dell
 */
public class CustomerDao {
    public static void save(Customer customer) {
        String query = "insert into customer(email,password) values('" + customer.getEmail() + "','" + customer.getPassword()+"')";
        DbOperations.setDataorDelete(query, "Registerd Successfully!!!");
    }
    
}
