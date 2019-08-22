package com.oasis.hrm.dao;

import com.oasis.hrm.dao.pojo.HrmReportBO;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface HrmRepotBODao {
    List<HrmReportBO> findByTime(@Param("beginTime") String beginTime,@Param("endTime")String endTime);

}
