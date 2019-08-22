package com.oasis.hrm.service.impl;

import com.oasis.hrm.dao.pojo.HrmReportBO;
import com.oasis.hrm.dao.pojo.HrmReportDTO;
import com.oasis.hrm.service.iservice.HrmReportBOService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class HrmReportBOServiceImplTest {
    @Autowired
    HrmReportBOService hrmReportBOService;


    @Test
    public void findByTime() {
        List<HrmReportBO> infos=hrmReportBOService.findByTime("2019-08-01","2019-08-31");
        for(HrmReportBO info:infos){
            System.err.println(info);
        }
    }
}