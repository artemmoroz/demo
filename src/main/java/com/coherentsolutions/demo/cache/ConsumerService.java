package com.coherentsolutions.demo.cache;

import com.coherentsolutions.demo.events.TestFailEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ConsumerService {

    @Autowired
    ProducerService service;

    public void doSomeAction(){
      log.info("Start doing smthing...");
      log.info("It's time for big number #1 {}", service.calculateHugeNumber());
      log.info("It's time for big number #2 {}", service.calculateHugeNumber());
      log.info("It's time for big number #3 {}", service.calculateHugeNumber());
      log.info("Stop");
    }

}
