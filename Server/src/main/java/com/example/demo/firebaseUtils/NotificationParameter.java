package com.example.demo.firebaseUtils;

public enum NotificationParameter {
    ;

    private static String url;

    static {
        url = "localhost:5000/notificationApplication";
    }

    public static String getUrl() {
        return url;
    }
}
