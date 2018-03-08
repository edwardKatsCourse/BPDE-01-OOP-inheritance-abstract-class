package com.company.notification.type;

import com.company.notification.CriticalNotification;
import com.company.notification.Notification;

public class SystemNotification extends Notification implements CriticalNotification {

    public SystemNotification(String message) {
        super(message);
    }

    @Override
    public String getType() {
        return "system";
    }

    @Override
    public void method_1() {
        System.out.println("SystemNotification method_1");
    }

    @Override
    public void method_2() {
        System.out.println("SystemNotification method_2");
    }
}
