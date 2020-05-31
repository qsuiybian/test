package com.gqy.restfuldemo.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author:Cady
 * @version:
 * @Project: restfuldemo
 * @Package: com.gqy.restfuldemo
 * @Description:
 * @Date date: 2018-07-30
 */
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private static Logger logger = LoggerFactory.getLogger(GreetingController.class);

    /**
     * @Description
     * @Date: 11:38 2018-07-30
     * @Param name
     * @return com.gqy.restfuldemo.hello.Greeting
     */
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        logger.info("greeting v1");
        logger.warn("greeting warn v2");
        logger.debug("greeting debug");
        logger.error("greeting error");
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
