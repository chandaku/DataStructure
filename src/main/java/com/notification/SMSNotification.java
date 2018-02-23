package com.notification;

import java.util.List;

public abstract class SMSNotification<T> implements Notification {
    //SMS service;
    protected List<String> to;
    protected List<String> from;
    protected List<String> subject;
    protected String body;
    public final void send() {
        prepare();
        //service.sendSMS(to,from,subject,body);
    }

}
