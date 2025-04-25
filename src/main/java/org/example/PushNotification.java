package org.example;

// PushNotification.java


public class PushNotification implements NotificationService {


    @Override
    public void sendNotification(String message ){
        System.out.println("Sending Push Notification: " + message);
    }
}
