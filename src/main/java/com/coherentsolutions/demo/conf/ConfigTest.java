package com.coherentsolutions.demo.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigTest {

    @Value("${issoft.key1:555}")
    Integer key1;

    public void testConfig1(){
        System.out.println(key1);
    }

    @Autowired
    IssoftProperties properties;

    public void testConfig2(){
        System.out.println(properties.getKey1() + " -- " + properties.getNum());
    }
}
