package com.example.tech_wuliao.mapper;


import com.example.tech_wuliao.entity.GoodsConnect;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsConnectMapper {

    List<GoodsConnect> get(String description);
}
