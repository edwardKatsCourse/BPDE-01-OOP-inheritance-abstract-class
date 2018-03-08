package com.company.notification.type;

import com.company.notification.CriticalNotification;
import com.company.notification.NonCriticalNotification;
import com.company.notification.Notification;

public class InformationalNotification extends Notification implements CriticalNotification, NonCriticalNotification {

    public InformationalNotification(String message) {
        super(message);
    }

    @Override
    public String getType() {
        return "info";
    }


    @Override
    public void method_1() {
        //required to implement by CriticalImplementation interface
    }

    @Override
    public void method_2() {
        //required to implement by CriticalImplementation interface
    }
}
