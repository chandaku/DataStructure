package com.notification;

import java.util.concurrent.Callable;

public abstract class Job implements Runnable{

    Notification notification;

    public final void run() {
        this.notification.send();
    }
}
