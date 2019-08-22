package com.oasis.hrm.service.impl;

import com.oasis.hrm.dao.pojo.HrmReportBO;

import com.oasis.hrm.dao.pojo.HrmReportDTO;
import com.oasis.hrm.service.iservice.HrmReportService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class HrmReportServiceImplTest {
    @Autowired
    HrmReportService hrmReportService;



    @Test
    public void findByTime() {
        List<HrmReportDTO> infos=hrmReportService.findByTime("2019-08-01","2019-08-31");
        for(HrmReportDTO info:infos){
            System.err.println(info);
        }
    }
}