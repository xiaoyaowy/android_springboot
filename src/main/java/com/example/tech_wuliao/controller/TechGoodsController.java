package com.example.tech_wuliao.controller;

import java.util.List;

import com.example.tech_wuliao.entity.TechGoods;
import com.example.tech_wuliao.service.TechGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author wuye 2021/09/03 15:53
 */

@RestController
@RequestMapping("/test")
public class TechGoodsController {

    @Autowired
    private TechGoodsService techGoodsService;

    @RequestMapping(value = "/get/{wuliaoNum}", method = RequestMethod.GET)
    public List<TechGoods> getUser(@PathVariable String wuliaoNum){
        return techGoodsService.get(wuliaoNum);
    }

}
