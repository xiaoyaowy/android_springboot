package com.example.tech_wuliao.service;

import java.util.List;

import com.example.tech_wuliao.entity.TechGoods;
import com.example.tech_wuliao.mapper.TechGoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description
 *
 * @author wuye 2021/09/03 15:51
 */
@Service
public class TechGoodsService {

    @Autowired
    private TechGoodsMapper techGoodsMapper;

    public List<TechGoods> get(String wuliaoNum){
        return techGoodsMapper.get(wuliaoNum);
    }


}
