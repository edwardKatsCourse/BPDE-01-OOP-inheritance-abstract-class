package com.company.notification;

import com.company.notification.type.AdvertisementNotification;
import com.company.notification.type.InformationalNotification;
import com.company.notification.type.SystemNotification;

import java.util.Scanner;

public class NotificationDemo {

    public static int criticalMessagesCount = 0;
    public static int nonCriticalMessagesCount = 0;

    public static void main(String[] args) {
        //type:message

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                System.out.println(String.format("Critical messages: %s", criticalMessagesCount));
                System.out.println(String.format("Non critical messages: %s", nonCriticalMessagesCount));
                return;
            }

            String[] split = input.split(":");

            Notification notification = resolveNotificationType(split[0], split[1]);

            if (notification == null) {
                System.out.println("Message type is not recognized");
                return;
            }
            //notification -> type
            //(empty) -> type

            System.out.println(String.format("Received %s message with text [%s]",
                    notification.getType(),
                    notification.getMessage()));

            if (notification instanceof CriticalNotification) {
                criticalMessagesCount++;
            }

            if (notification instanceof NonCriticalNotification) {
                nonCriticalMessagesCount++;
            }

//            *** EXAMPLE CODE ***
//            CriticalNotification criticalNotification = new SystemNotification("");
//            NonCriticalNotification nonCriticalNotification = new AdvertisementNotification("");
//
//            CriticalNotification [] criticalNotifications = new CriticalNotification[1];
//
//            for (int i = 0; i < criticalNotifications.length; i++) {
//                criticalNotifications[i].method_1();
//                criticalNotifications[i].method_2();
//            }
        }

    }

    public static Notification resolveNotificationType(String type, String message) {
        switch (type) {
            case "system":
                return new SystemNotification(message);
            case "ad":
                return new AdvertisementNotification(message);
            case "info":
                return new InformationalNotification(message);
        }

        return null;
    }
}
