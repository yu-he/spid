package com.yuhe.spid.web.fil;

import com.yuhe.spid.fil.entity.FilAwbInfoEntity;
import com.yuhe.spid.fil.service.FilAwbInfoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/filAwbInfo")
public class FilAwbInfoController {
    private final FilAwbInfoService service;

    @GetMapping("/getOneTest")
    public FilAwbInfoEntity getOneTest() {
        return service.getOneTest();
    }
}
