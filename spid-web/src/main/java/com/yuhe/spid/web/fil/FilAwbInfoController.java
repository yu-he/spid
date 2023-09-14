package com.yuhe.spid.web.fil;

import com.yuhe.spid.fil.entity.FilAwbInfoEntity;
import com.yuhe.spid.fil.service.FilAwbInfoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/filAwbInfo")
public class FilAwbInfoController {
    private final FilAwbInfoService service;

    @GetMapping("/getOneTest")
    public FilAwbInfoEntity getOneTest() {
        return service.getOneTest();
    }

    @GetMapping("/getListTest")
    public List<FilAwbInfoEntity> getListTest() {
        return service.getListTest();
    }

    @PostMapping("/updateCreateTime")
    public int updateCreateTime(@RequestBody FilAwbInfoEntity entity){
        return service.updateCreateTime(entity);
    }
}
