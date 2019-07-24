package com.example.demo2.service.impl;

import com.example.demo2.bean.Wuser;
import com.example.demo2.mapper.WuserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class WuserServiceImpl implements com.example.demo2.service.WuserService {
    @Resource
    private WuserMapper wm;
    @Override
    public List<Wuser> FindAll() {
        return wm.FindAll();
    }
}
