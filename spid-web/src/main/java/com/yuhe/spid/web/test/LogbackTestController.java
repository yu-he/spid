package com.yuhe.spid.web.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogbackTestController {
    @GetMapping("/logbackTest")
    public String index(){
        log.debug("debugTest");
        log.info("infoTest");
        log.error("errorTest");
        return "logbackTest";
    }
}
