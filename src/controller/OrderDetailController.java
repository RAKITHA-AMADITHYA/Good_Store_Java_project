package controller;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import model.OrderDetail;

class OrderDetailController {

    public static boolean addOrderDetails(ArrayList<OrderDetail> orderDetailList) throws ClassNotFoundException, SQLException {
        for (OrderDetail orderDetail : orderDetailList) {
            boolean isAdded = addOrderDetails(orderDetail);
            if (!isAdded) {
                return false;
            }
        }
        return true;
    }

    public static boolean addOrderDetails(OrderDetail orderDetail) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into OrderDetail values(?,?,?,?)");
        stm.setObject(1, orderDetail.getOrderid());
        stm.setObject(2, orderDetail.getItemcode());
        stm.setObject(3, orderDetail.getQty());
        stm.setObject(4, orderDetail.getUnitPrice());
        return stm.executeUpdate()>0;
    }
}
