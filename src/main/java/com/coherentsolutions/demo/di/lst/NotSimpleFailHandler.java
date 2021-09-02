package com.coherentsolutions.demo.di.lst;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
public class NotSimpleFailHandler implements FailHandler{
    @Override
    public void handleFailEvent(String testName) {
        System.out.println("NOTSimple handle "+testName);
    }
}
