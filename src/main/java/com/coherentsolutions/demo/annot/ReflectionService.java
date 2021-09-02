package com.coherentsolutions.demo.annot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;

@Service
@Slf4j
public class ReflectionService {

    public void extraActionsForDemo(Object obj){
        Class cls = obj.getClass();
        Demo demo = AnnotationUtils.findAnnotation(cls, Demo.class);
        if(demo!=null){
            Field nameField = ReflectionUtils.findField(cls, "user");
            nameField.setAccessible(true);
            ReflectionUtils.setField(nameField, obj, demo.value());
        }
        log.info("Reflection obj {}", obj);
    }
}
