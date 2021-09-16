package com.example.tech_wuliao.service;


import com.example.tech_wuliao.entity.GoodsConnect;
import com.example.tech_wuliao.mapper.GoodsConnectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsConnectService {

    @Autowired
    private GoodsConnectMapper goodsConnectMapper;

    public List<GoodsConnect> get(String description){
        return goodsConnectMapper.get(description);
    }

}
