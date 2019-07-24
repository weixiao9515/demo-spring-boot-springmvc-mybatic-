package com.example.demo2.controller;

import com.example.demo2.bean.Wuser;
import com.example.demo2.service.WuserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class WuserController {
    @Resource
    private WuserService ws;
    @RequestMapping("/findall")
    @ResponseBody
    public List<Wuser> FindAll(){
        return ws.FindAll();
    }
}
