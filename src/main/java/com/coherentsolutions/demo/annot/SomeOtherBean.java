package com.coherentsolutions.demo.annot;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SomeOtherBean {

    String lang;
}
