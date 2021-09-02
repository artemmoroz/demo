package com.coherentsolutions.demo.di.dm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DmTest {

    @Autowired
    DriverManager driverManager;
////---
//    public DmTest(DriverManager driverManager) {
//        this.driverManager = driverManager;
//    }
// //--
//    public void setDriverManager(DriverManager driverManager) {
//        this.driverManager = driverManager;
//    }

    public void testDm(){
        System.out.println(driverManager.getDriver());
    }


}
