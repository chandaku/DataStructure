package com.notification;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public abstract  class JobExecutor extends Job {

    ScheduledExecutorService service = Executors.newScheduledThreadPool(1);

    JobExecutor(Notification notification){
        this.notification = notification;
    }

    public void execute(){
        service.scheduleWithFixedDelay(this,this.getInitialDelay(),this.getDelay() ,this.getTimeUnit());
    }

    protected abstract TimeUnit getTimeUnit();

    protected abstract long getDelay();

    protected abstract long getInitialDelay();

}
