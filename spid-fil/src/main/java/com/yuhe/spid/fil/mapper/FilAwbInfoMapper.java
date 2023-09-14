package com.yuhe.spid.fil.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yuhe.spid.fil.entity.FilAwbInfoEntity;

import java.util.List;

public interface FilAwbInfoMapper extends BaseMapper<FilAwbInfoEntity> {
    List<FilAwbInfoEntity> queryListTest(FilAwbInfoEntity entity);

    int updateCreateTime(FilAwbInfoEntity entity);
}
