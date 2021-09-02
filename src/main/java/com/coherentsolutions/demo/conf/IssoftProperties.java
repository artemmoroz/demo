package com.coherentsolutions.demo.conf;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@Validated
@Configuration
@ConfigurationProperties(prefix = "issoft.demo")
public class IssoftProperties {

    @Length(max = 15, min = 1)
    String key1;
    boolean key2;

    @Min(1)
    @Max(100)
    private int num;
}
