package com.sunyifeng.demo.controller.chart;

import com.sunyifeng.demo.service.chart.ChartDataService;
import com.sunyifeng.demo.service.user.SysUserService;
import com.sunyifeng.demo.vo.user.SysUserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@Api(tags = {"ChartDataController"}, description = "图表Controller")
@RestController
@RequestMapping(value = "/chart")
public class ChartDataController {

    @Autowired
    private ChartDataService chartDataService;

    @ApiOperation(value = "验证语句")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", dataType = "String", name = "sqlStr", value = "查询语句", required = true)
    })
    @PostMapping("/checkSyntax")
    public void checkSyntax(String sqlStr) throws Exception {
        this.chartDataService.checkSyntax(sqlStr);
    }

}
