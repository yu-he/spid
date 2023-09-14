package com.yuhe.spid.base.service;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.yuhe.spid.base.entity.BasCtrCodeEntity;
import com.yuhe.spid.base.mapper.BasCtrCodeMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@AllArgsConstructor
public class BasCtrCodeService {
    @Autowired
    private BasCtrCodeMapper mapper;

    public int updateTest(){
        BasCtrCodeEntity entity = new BasCtrCodeEntity();
        entity.setCtrCodeId("FDA");
        entity.setCtrCodeDescChn("中文描述");
        entity.setCtrCodeDescEng("英文描述");
        entity.setOperationTime(new Date());

        UpdateWrapper<BasCtrCodeEntity> wrapper = Wrappers.update();
        wrapper.lambda().eq(BasCtrCodeEntity::getCtrCodeId, entity.getCtrCodeId());

        return mapper.update(entity, wrapper);
    }
}
