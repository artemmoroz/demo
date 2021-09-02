package com.coherentsolutions.demo.di.dm;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Service
@Scope(SCOPE_PROTOTYPE)
public class CredentialService {

    public Map<String, String> getCreds() {
        return Collections.singletonMap("test", "pass " + this.toString());
    }
}
