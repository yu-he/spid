package com.yuhe.spid.web.test;

import com.yuhe.spid.fil.entity.FilAwbInfoEntity;
import com.yuhe.spid.fil.service.FilAwbInfoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TransactionalTestController {
    private final FilAwbInfoService filAwbInfoService;

    @PostMapping("transactionalTest")
    public int transactionalTest(@RequestBody FilAwbInfoEntity entity) throws Exception {
        return filAwbInfoService.TransactionalTest(entity);
    }
}
