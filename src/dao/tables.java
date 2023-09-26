package dao;

import javax.swing.JOptionPane;

public class tables {

    public static void main(String[] args) {
        try {
            String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),address varchar(200),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE (email))";
            DbOperations.setDataorDelete(userTable, "User Table created successfully");
            String adminDetails = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('admin','admin@gmail.com','9876543210','Kathmandu','admin','what primary school did you attend?','small kids','true')";
            DbOperations.setDataorDelete(adminDetails, "Admin Details Added Successfully");
            String categoryTable = " create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
            DbOperations.setDataorDelete(categoryTable, "Category Table Created Successfully");
            String productTable = "create table product(id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200))";
            DbOperations.setDataorDelete(productTable, "Product Table Created Successfully");
            String billTable = " create table bill(id int primary key,name varchar(200),mobileNumber varchar(200),email varchar(200), date varchar(50),total varchar(200),createdBy varchar(200),UNIQUE (mobileNumber))";
            DbOperations.setDataorDelete(billTable, "Bill Table Created Successfully");
            String customerTable = " create table customer(id int primary key,name varchar(200),email varchar(200),address varchar(200),mobileNumber varchar(200),password varchar(200),UNIQUE (email),UNIQUE (mobileNumber))";
            DbOperations.setDataorDelete(customerTable, "Customer Table Created Successfully");
            
            String customerLoginTable = " create table customerLogin(id int primary key,email varchar(200),password varchar(200),UNIQUE (email))";
            DbOperations.setDataorDelete(customerLoginTable, "Customer Table Created Successfully");
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
