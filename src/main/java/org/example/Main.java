package org.example;



public class Main {
    public static void main(String[] args) {


        NotificationService push = new PushNotification();
        push.sendNotification("New message received!");


        NotificationService sms = new SMSNotification();
        sms.sendNotification("Meeting reminder!");


        NotificationService email = new EmailNotification();
        email.sendNotification("Welcome to our service!");
    }
}
