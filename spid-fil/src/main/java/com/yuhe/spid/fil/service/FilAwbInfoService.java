package com.yuhe.spid.fil.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yuhe.spid.fil.entity.FilAwbInfoEntity;
import com.yuhe.spid.fil.mapper.FilAwbInfoMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FilAwbInfoService {
    private final FilAwbInfoMapper mapper;

    public FilAwbInfoEntity getOneTest() {
        QueryWrapper<FilAwbInfoEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("billId", "AWBA99901010100");
        return mapper.selectOne(queryWrapper);
    }

    public List<FilAwbInfoEntity> getListTest(){
        FilAwbInfoEntity entity = new FilAwbInfoEntity();
        entity.setStockTypeId("AWBH");
        entity.setStockPre("99910101055");
        return mapper.queryListTest(entity);
    }
}
