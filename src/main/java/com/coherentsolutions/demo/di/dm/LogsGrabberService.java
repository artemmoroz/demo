package com.coherentsolutions.demo.di.dm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class LogsGrabberService {

    @Autowired
    CredentialService credentialService;

    public List<String> getLogs(){
        return Arrays.asList(credentialService.getCreds().toString());
    }
}
