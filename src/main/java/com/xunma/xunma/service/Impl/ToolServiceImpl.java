package com.xunma.xunma.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xunma.xunma.mapper.ToolMapper;
import com.xunma.xunma.pojo.Tool;
import com.xunma.xunma.service.ToolService;
import org.springframework.stereotype.Service;

@Service
public class ToolServiceImpl extends ServiceImpl<ToolMapper, Tool> implements ToolService {
}
