package com.yuhe.spid.base.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("t_bas_ctrcode")
public class BasCtrCodeEntity {
    private String ctrCodeId;
    private String ctrCodeDescChn;
    private String ctrCodeDescEng;
    private Date operationTime;
}
