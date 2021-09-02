package com.coherentsolutions.demo.annot;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@ToString(callSuper = true)
public class NestedAnnotationBean extends DemoBean{

    String pass;
}
