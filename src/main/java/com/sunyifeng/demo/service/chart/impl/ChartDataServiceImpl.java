package com.sunyifeng.demo.service.chart.impl;

import com.sunyifeng.demo.service.chart.ChartDataService;
import com.sunyifeng.demo.vo.ResultVO;
import com.sunyifeng.demo.vo.user.UserRoleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChartDataServiceImpl implements ChartDataService {

    @Autowired
    private ChartDataService chartDataMapper;


    @Override
    public void checkSyntax(String sqlStr) throws Exception {

        System.out.println("sqlStr:" + sqlStr);

        this.chartDataMapper.checkSyntax(sqlStr);

    }
}
