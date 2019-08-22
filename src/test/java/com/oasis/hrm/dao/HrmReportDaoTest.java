package com.oasis.hrm.dao;

import com.oasis.hrm.dao.pojo.HrmReportDTO;
import com.oasis.hrm.dao.pojo.NewEmpDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class HrmReportDaoTest {
    @Autowired
    HrmReportDao hrmReportDao;

    @Test
    public void findByTime() {
        List<HrmReportDTO> infos = hrmReportDao.findByTime("2019-08-01","2019-08-31");
        for(HrmReportDTO info:infos){
            System.err.println(info);
        }


    }
}