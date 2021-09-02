package com.coherentsolutions.demo.events;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class OneMoreHandlerClass {


    @EventListener
    @Async
    public void handleFailEvent(TestFailEvent event){
        System.out.println("OneMoreHandler get " + event + " -- "+ Thread.currentThread().getName());
    }
}
