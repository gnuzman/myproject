package com.szhouse.logback;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zzh on 2017/6/4.
 */
@RestController
public class LogController {
    @GetMapping("/test")
    public String test() {
        Logger logger = (Logger) LoggerFactory.getLogger(LogController.class);

        logger.error("log error test");
        return "ggg";
    }
}
