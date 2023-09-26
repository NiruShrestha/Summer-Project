
package dao;


import model.CustomerSignup;
import java.sql.*;

public class CustomerSignupDao {
    public static void save(CustomerSignup customer){
        String query = "insert into customer(name,email,mobileNumber,address,password) values('" + customer.getName() + "','" + customer.getEmail() + "','" + customer.getAddress() + "','" + customer.getMobileNumber() + "','" + customer.getPassword() +"')";

        DbOperations.setDataorDelete(query, "Registerd Successfully!!!");
    }

}
