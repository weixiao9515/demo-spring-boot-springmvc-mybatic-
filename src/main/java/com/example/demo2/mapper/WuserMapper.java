package com.example.demo2.mapper;

import com.example.demo2.bean.Wuser;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface WuserMapper {
    List<Wuser> FindAll();
}
