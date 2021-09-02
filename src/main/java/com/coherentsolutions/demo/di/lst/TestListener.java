package com.coherentsolutions.demo.di.lst;

import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Random;

@Component
@Slf4j
public class TestListener {

    @Autowired(required = false)
    List<FailHandler> failHandlers;

    public void onTestFail(){
        String testName = "xxxYYY"+new Random().nextInt(100);
        //process fail state with several handlers
        if(!CollectionUtils.isEmpty(failHandlers)){
            failHandlers.forEach(h->h.handleFailEvent(testName));
        }else{
            log.warn("There are not proper handlers");
        }
    }
}
