package com.coherentsolutions.demo.events;

import com.coherentsolutions.demo.di.lst.FailHandler;
import com.github.javafaker.Faker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Random;

@Component
@Slf4j
public class TestListener2 {

    @Autowired
    ApplicationContext applicationContext;

    public void onTestFail(){
        Faker faker = new Faker();
        String exc = faker.lorem().sentence();
        String testName = faker.hacker().noun();
        TestFailEvent event = new TestFailEvent().setTestName(testName).setException(exc);
        applicationContext.publishEvent(event);
    }
}
