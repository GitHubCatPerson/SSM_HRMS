package com.oasis.hrm.service.iservice;

import com.oasis.hrm.dao.pojo.HrmReportBO;

import java.util.List;

public interface HrmReportBOService {
    List<HrmReportBO> findByTime(String beginTime,String endTime);
}
