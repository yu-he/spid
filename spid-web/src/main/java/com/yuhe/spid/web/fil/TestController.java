package com.yuhe.spid.web.fil;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
