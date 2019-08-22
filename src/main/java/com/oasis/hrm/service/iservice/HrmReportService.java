package com.oasis.hrm.service.iservice;

import com.oasis.hrm.dao.pojo.HrmReportDTO;

import java.util.List;

public interface HrmReportService {
    List<HrmReportDTO> findByTime(String beginTime, String endTime);
}
