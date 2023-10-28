 package model;

public class OrderDetail {

    private String orderid;
    private String itemcode;
    private int qty;
    private double unitPrice;

    public OrderDetail() {

    }

    public OrderDetail(String id, String itemCode, int qty, double unitPrice) {
        this.orderid = id;
        this.itemcode = itemCode;
        this.qty = qty;
        this.unitPrice = unitPrice;

    }

    
    public String getOrderid() {
        return orderid;
    }

   
    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    
    public String getItemcode() {
        return itemcode;
    }

    
    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    
    public int getQty() {
        return qty;
    }

   
    public void setQty(int qty) {
        this.qty = qty;
    }

   
    public double getUnitPrice() {
        return unitPrice;
    }

    
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    @Override
    public String toString(){
        return " | Order Id "+orderid+" | Item Code "+itemcode+" | QTY "+qty+" | Unit Price "+unitPrice;
    }
    
    
    
    

}
