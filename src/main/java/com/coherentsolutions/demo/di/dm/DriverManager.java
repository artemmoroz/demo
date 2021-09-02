package com.coherentsolutions.demo.di.dm;

import com.coherentsolutions.demo.DemoApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class DriverManager {

//    public String getDriver(){
//        return "im new chrome driver";
//    }

    @Autowired
    LogsGrabberService service;

    @Autowired
    CredentialService credentialService;

    public String getDriver(){
        return "im new chrome driver\n" + service.getLogs() +"\n "+ credentialService.getCreds() ;
    }
}
