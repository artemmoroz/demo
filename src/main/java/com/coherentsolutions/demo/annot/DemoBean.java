package com.coherentsolutions.demo.annot;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@Demo("yyyy")
public class DemoBean {

    String user;
    int age;
}
