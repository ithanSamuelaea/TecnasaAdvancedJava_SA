package com.example.solid.exercise;

public class OrderManager {
    private emailsend emailService;
    private SMSsender smsService;
    private InvoiceService invoiceService;

    public OrderManager(InvoiceService invoiceService, emailsend emailService, SMSsender smsService) {
        this.emailService = emailService;
        this.smsService = smsService;
        this.invoiceService = invoiceService;
    }

    public void processOrder(Order order) {
        invoiceService.generateInvoice(order);
        emailService.sendEmail(order.getCustomerEmail(), "Your order has been processed.");
        smsService.sendSMS(order.getCustomerPhone(), "Your order has been processed.");
    }
}