package com.gqy.restfuldemo.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:Cady
 * @version:
 * @Project: restful_demo
 * @Package: com.gqy.log
 * @Description:
 * @Date date: 2018-08-01
 */

@RestController
public class LoggerTest {

    private static Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @RequestMapping("/log")
    public String testLog(){
        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");
        return "success";
    }
}
