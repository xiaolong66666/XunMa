package com.xunma.xunma.controller;

import com.xunma.xunma.conment.R;
import com.xunma.xunma.pojo.Tool;
import com.xunma.xunma.service.ToolService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/tool")
public class ToolController {
    @Autowired
    private ToolService toolService;
    @GetMapping("/list")
    public R<List<Tool>> getTools(){
        return R.success(toolService.list());
    }
}
