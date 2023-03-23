package com.xunma.xunma.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.xunma.xunma.conment.R;
import com.xunma.xunma.pojo.Report;
import com.xunma.xunma.service.ReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/report")
public class ReportController {
    @Autowired
    private ReportService reportService;
    @GetMapping("/list")
    public R<List<Report>> getAll(String title){
        log.info("官网被访问");
        LambdaQueryWrapper<Report> lqw = new LambdaQueryWrapper<>();
        lqw.like(StringUtils.isNotEmpty(title),Report::getTitle,title);
        lqw.orderByDesc(Report::getCreateTime);
        List<Report> list = reportService.list(lqw);
        return R.success(list);
    }
}
