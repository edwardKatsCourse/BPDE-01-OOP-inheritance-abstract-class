package com.company.notification.type;

import com.company.notification.NonCriticalNotification;
import com.company.notification.Notification;

public class AdvertisementNotification extends Notification implements NonCriticalNotification {

    public AdvertisementNotification(String message) {
        super(message);
    }

    @Override
    public String getType() {
        return "ad";
    }
}
