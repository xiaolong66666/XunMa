package com.xunma.xunma.service.Impl;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xunma.xunma.mapper.ReportMapper;
import com.xunma.xunma.pojo.Report;
import com.xunma.xunma.service.ReportService;
import org.springframework.stereotype.Service;

@Service
public class ReportServiceImpl extends ServiceImpl<ReportMapper, Report> implements ReportService {
}
