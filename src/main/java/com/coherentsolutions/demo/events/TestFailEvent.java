package com.coherentsolutions.demo.events;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class TestFailEvent {

    String testName;
    String exception;
}
