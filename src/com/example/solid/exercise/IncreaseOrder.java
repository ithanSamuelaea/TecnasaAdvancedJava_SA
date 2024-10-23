package com.example.solid.exercise;

public class IncreaseOrder extends Order {
    public double increasedOrder;

    public IncreaseOrder(String id, String customerEmail, String customerPhone, double amount) {
        super(id, customerEmail, customerPhone, amount);
        
    }

    public double getIncreasedOrder(){
        return getAmount() + increasedOrder;

    }
    
}
