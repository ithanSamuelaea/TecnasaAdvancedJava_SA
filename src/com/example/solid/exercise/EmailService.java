package com.example.solid.exercise;

public class EmailService implements emailsend{
    public void sendEmail(String recipient, String message) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}