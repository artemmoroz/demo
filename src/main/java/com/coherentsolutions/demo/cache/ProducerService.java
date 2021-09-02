package com.coherentsolutions.demo.cache;

import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@Slf4j
public class ProducerService {

    @Cacheable(cacheNames = "num")
    public double calculateHugeNumber() {
        log.info("Will calculate");
        return new Random().nextDouble();
    }

}
