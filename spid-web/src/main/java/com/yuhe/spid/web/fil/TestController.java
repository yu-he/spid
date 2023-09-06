package com.yuhe.spid.web.fil;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class TestController {
    @GetMapping("/index")
    public String index(){
        log.debug("debugTest");
        log.info("infoTest");
        log.error("errorTest");
        return "index";
    }
}
