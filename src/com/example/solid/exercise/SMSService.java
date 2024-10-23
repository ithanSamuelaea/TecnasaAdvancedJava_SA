package com.example.solid.exercise;

public class SMSService implements SMSsender {
    public void sendSMS(String phoneNumber, String message) {
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}