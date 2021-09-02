package com.coherentsolutions.demo;

import com.coherentsolutions.demo.annot.DemoBean;
import com.coherentsolutions.demo.annot.NestedAnnotationBean;
import com.coherentsolutions.demo.annot.ReflectionService;
import com.coherentsolutions.demo.annot.SomeOtherBean;
import com.coherentsolutions.demo.cache.ConsumerService;
import com.coherentsolutions.demo.conf.ConfigTest;
import com.coherentsolutions.demo.di.dm.DmTest;
import com.coherentsolutions.demo.di.lst.TestListener;
import com.coherentsolutions.demo.events.TestFailEvent;
import com.coherentsolutions.demo.events.TestListener2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
//eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJqaXJhOjcwODIwODgiLCJjb250ZXh0Ijp7ImJhc2VVcmwiOiJodHRwczpcL1wvY29oZXJlbnRzb2x1dGlvbnMuYXRsYXNzaWFuLm5ldCIsInVzZXIiOnsiYWNjb3VudElkIjoiNWIyMjc3ZjIzNGE2Y2QyZDUwZmUyY2YwIn19LCJpc3MiOiJjb20ua2Fub2FoLnRlc3QtbWFuYWdlciIsImV4cCI6MTY2MTI2ODAxNSwiaWF0IjoxNjI5NzMyMDE1fQ.pwwIgCEe6_ql_dZ2naLKCABgwUyWJPSO820NS1cSJlg
@SpringBootApplication
@ConfigurationPropertiesScan(value = "com.coherentsolutions.demo")
@EnableAsync
@EnableCaching
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    private Sample sample = Sample.REF;


    DmTest dmTest;
    ConfigTest configTest;
    TestListener listener;
    TestListener2 listener2;
    ReflectionService reflection;
    ConsumerService consumerService;

    public DemoApplication(DmTest dmTest, ConfigTest configTest, TestListener listener, TestListener2 listener2, ReflectionService reflection, ConsumerService consumerService) {
        this.dmTest = dmTest;
        this.configTest = configTest;
        this.listener = listener;
        this.listener2 = listener2;
        this.reflection = reflection;
        this.consumerService = consumerService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n--------------------------------\n");

        switch (sample) {
            case DM: {
                dmTest.testDm();
                break;
            }
            case CONFIG1: {
                configTest.testConfig1();
                break;
            }
            case CONFIG2: {
                configTest.testConfig2();
                break;
            }
            case LST: {
                listener.onTestFail();
                break;
            }
            case LST2: {
                listener2.onTestFail();
                break;
            }
            case REF:{
                reflection.extraActionsForDemo(new DemoBean().setUser("Artem"));
                reflection.extraActionsForDemo(new SomeOtherBean().setLang("RU_ru"));
                reflection.extraActionsForDemo(new NestedAnnotationBean().setPass("asdasd").setUser("Nested"));
                break;
            }case CACHE:{
                consumerService.doSomeAction();
                break;
            }
        }
    }
}
