package com.coherentsolutions.demo.aspect;

import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Aspect
@Slf4j
@Component
public class LoggingAspect {

    @After("execution(* com.coherentsolutions.demo.annot.ReflectionService.*(..))")
    public void demoAspect(JoinPoint joinPoint) {
        log.info("After reflection service method [{}] execution", joinPoint.getSignature().toShortString());
    }
}
