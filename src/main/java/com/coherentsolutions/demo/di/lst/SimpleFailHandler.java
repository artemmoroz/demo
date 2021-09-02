package com.coherentsolutions.demo.di.lst;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class SimpleFailHandler implements FailHandler{
    @Override
    public void handleFailEvent(String testName) {
        System.out.println("Simple handle "+testName);
    }
}
