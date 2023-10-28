package controller;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Customer;

public class CustomerController {

    public static boolean addCustomer(Customer customer) throws ClassNotFoundException, SQLException {

        String SQL = "Insert into Customer Values(?,?,?,?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(SQL);
        pstm.setObject(1, customer.getId());
        pstm.setObject(2, customer.getName());
        pstm.setObject(3, customer.getAddress());
        pstm.setObject(4, customer.getSalary());

        return pstm.executeUpdate() > 0;
    }

    public static Customer searchCustomer(String id) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        String SQL = "Select * From Customer where id='" + id + "'";
        ResultSet rst = stm.executeQuery(SQL);

        return rst.next() ? new Customer(id, rst.getString("name"), rst.getString("address"), rst.getDouble("salary")) : null;

    }

    public static boolean updateCustomer(Customer customer) throws ClassNotFoundException, SQLException {

        String SQL = "Update Customer set name=?,address=?,salary=? where id=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(SQL);
        
        pstm.setObject(1, customer.getName());
        pstm.setObject(2, customer.getAddress());
        pstm.setObject(3, customer.getSalary());
        pstm.setObject(4, customer.getId());
        
        return pstm.executeUpdate() > 0;
    }
    
    public static boolean deleteCustomer(String id) throws ClassNotFoundException, SQLException{
      
          return DBConnection.getInstance().getConnection().createStatement().executeUpdate("DELETE FROM Customer WHERE id='"+id+"'")>0;
    }

    public static ArrayList<Customer> getAllCustomer() throws ClassNotFoundException, SQLException {
       String SQL = "SELECT * FROM Customer";
       Connection connection = DBConnection.getInstance().getConnection();
       Statement stm = connection.createStatement();
       ResultSet rst = stm.executeQuery(SQL);
      ArrayList<Customer>customerList=new ArrayList<>();
      
      while(rst.next()){
          customerList.add( new Customer(rst.getString("id"), rst.getString("name"), rst.getString("address"), rst.getDouble("salary")));
      }
        return customerList;
    }

}
