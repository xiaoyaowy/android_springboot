package com.example.tech_wuliao.controller;


import com.example.tech_wuliao.entity.GoodsConnect;
import com.example.tech_wuliao.entity.TechGoods;
import com.example.tech_wuliao.service.GoodsConnectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/code")
public class GoodsConnectController {

    @Autowired
    private GoodsConnectService goodsConnectService;

    @RequestMapping(value = "/get/{description}", method = RequestMethod.GET)
    public List<GoodsConnect> get(@PathVariable String description){
        return goodsConnectService.get(description);
    }

}
