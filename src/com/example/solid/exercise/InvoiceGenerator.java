package com.example.solid.exercise;

public class InvoiceGenerator implements InvoiceService{
    public void generateInvoice(Order order) {
        System.out.println("Generating invoice for Order ID: " + order.getId());
        // Generating invoice logic
    }
}