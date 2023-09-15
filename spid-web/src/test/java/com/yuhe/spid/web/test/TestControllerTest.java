package com.yuhe.spid.web.test;

import com.yuhe.spid.fil.entity.FilAwbInfoEntity;
import com.yuhe.spid.fil.service.FilAwbInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring-mvc.xml"})
public class TestControllerTest {
    @Autowired
    private FilAwbInfoService filAwbInfoService;

    @Test
    public void index() {
        FilAwbInfoEntity awbInfoEntity = filAwbInfoService.getOneTest();
        System.out.println(awbInfoEntity.getBillId());
    }
}