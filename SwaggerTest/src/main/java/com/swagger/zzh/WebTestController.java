package com.swagger.zzh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zzh on 2017/6/12.
 */
@RestController
public class WebTestController {
    @GetMapping("/test")
    public String test() {
        return "test";
    }
}