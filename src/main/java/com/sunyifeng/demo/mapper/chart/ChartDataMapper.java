package com.sunyifeng.demo.mapper.chart;

import com.sunyifeng.demo.entity.user.UserRole;
import com.sunyifeng.demo.vo.user.UserRoleVO;

public interface ChartDataMapper {

   void checkSyntax(String sqlStr) throws Exception;

}