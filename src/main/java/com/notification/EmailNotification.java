package com.notification;

import java.util.List;

public abstract class EmailNotification<T> implements Notification {
    //EmailService service;
    protected List<String> to;
    protected List<String> from;
    protected List<String> subject;
    protected String body;
    public final void send() {
        prepare();
        //service.sendEmail(to,from,subject,body);
    }
    abstract void setTo(List<String> to);
    abstract void setFrom(List<String> from);
    abstract void setSubject(List<String> subject);
    abstract void setBody(String body);
}
