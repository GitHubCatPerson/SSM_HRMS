package com.oasis.hrm.dao;

import com.oasis.hrm.dao.pojo.HrmReportDTO;
import com.oasis.hrm.dao.pojo.NewEmpDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HrmReportDao {
    List<HrmReportDTO> findByTime(@Param("beginTime")String beginTime, @Param("endTime")String endTime);

}
