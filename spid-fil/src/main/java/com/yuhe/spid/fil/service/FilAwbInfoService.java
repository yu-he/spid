package com.yuhe.spid.fil.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yuhe.spid.base.service.BasCtrCodeService;
import com.yuhe.spid.fil.entity.FilAwbInfoEntity;
import com.yuhe.spid.fil.mapper.FilAwbInfoMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
@AllArgsConstructor
public class FilAwbInfoService {
    private final FilAwbInfoMapper mapper;
    private final BasCtrCodeService basCtrCodeService;

    public FilAwbInfoEntity getOneTest() {
        QueryWrapper<FilAwbInfoEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("billId", "AWBA99901010100");
        return mapper.selectOne(queryWrapper);
    }

    public List<FilAwbInfoEntity> getListTest() {
        FilAwbInfoEntity entity = new FilAwbInfoEntity();
        entity.setStockTypeId("AWBH");
        entity.setStockPre("99910101055");
        return mapper.queryListTest(entity);
    }

    public int updateCreateTime(FilAwbInfoEntity entity) {
        if (StringUtils.isEmpty(entity.getStockTypeId())) {
            entity.setStockTypeId("AWBH");
        }
        if (StringUtils.isEmpty(entity.getStockPre())) {
            entity.setStockPre("99910101055");
        }
        if (StringUtils.isEmpty(entity.getStockNo())) {
            entity.setStockNo("3");
        }
        return mapper.updateCreateTime(entity);
    }

    @Transactional
    public int TransactionalTest(FilAwbInfoEntity entity) throws Exception {
        updateCreateTime(entity);

        if (true) {
            throw new Exception("抛出异常");
        }

        return basCtrCodeService.updateTest();
    }
}
