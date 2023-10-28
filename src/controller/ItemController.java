package controller;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Item; // Import the Item class from the model package
import model.OrderDetail;

public class ItemController {

    public static boolean addItem(Item item) throws ClassNotFoundException, SQLException {
        String SQL = "INSERT INTO Item (code, description, unitPrice, qtyOnHand) VALUES (?, ?, ?, ?)";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(SQL);
        pstm.setObject(1, item.getCode());
        pstm.setObject(2, item.getDescription());
        pstm.setObject(3, item.getUnitPrice());
        pstm.setObject(4, item.getQtyOnHand());
        return pstm.executeUpdate() > 0;
    }

    public static Item searchItem(String code) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        String SQL = "Select * From Item where code='" + code + "'";
        ResultSet rst = stm.executeQuery(SQL);

        return rst.next() ? new Item(code, rst.getString("description"), rst.getDouble("unitPrice"), rst.getInt("qtyOnHand")) : null;

    }

    public static boolean updateItem(Item item) throws ClassNotFoundException, SQLException {
        String SQL = "UPDATE Item SET description=?, unitPrice=?, qtyOnHand=? WHERE code=?";
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement(SQL);

        pstm.setString(1, item.getDescription());
        pstm.setDouble(2, item.getUnitPrice());
        pstm.setInt(3, item.getQtyOnHand());
        pstm.setString(4, item.getCode());

        return pstm.executeUpdate() > 0;
    }

    public static boolean deleteItem(String code) throws ClassNotFoundException, SQLException {
        // Corrected SQL query and table name
        int rowsAffected = DBConnection.getInstance().getConnection().createStatement().executeUpdate("DELETE FROM Item WHERE code='" + code + "'");
        return rowsAffected > 0;
    }

    public static ArrayList<Item> getAllCustomer() throws ClassNotFoundException, SQLException {
        String SQL = "SELECT * FROM Item";
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        ArrayList<Item> itemList = new ArrayList<>();

        while (rst.next()) {
            itemList.add(new Item(rst.getString("code"), rst.getString("description"), rst.getDouble("unitPrice"), rst.getInt("qtyOnHand")));
        }
        return itemList;
    }

    public static boolean updateStock(ArrayList<OrderDetail> orderDetailList) throws ClassNotFoundException, SQLException {
        for (OrderDetail orderDetail : orderDetailList) {
            if (!updateStock(orderDetail)) {
                return false;
            }
        }
        return true;

    }

    public static boolean updateStock(OrderDetail orderDetail) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Update Item set qtyOnHand=qtyOnHand -? where code=?");
             stm.setObject(1, orderDetail.getQty());
             stm.setObject(2, orderDetail.getItemcode());
            

        return stm.executeUpdate()>0;

    }
}
