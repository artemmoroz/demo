package com.coherentsolutions.demo.events;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AnyHandlerClass {


    @EventListener
    @Async
    public void handleFailEvent(TestFailEvent event){
        System.out.println("AnyHandler get " + event+ " -- "+ Thread.currentThread().getName());
    }
}
