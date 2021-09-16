package com.example.tech_wuliao.mapper;

import java.util.List;
import com.example.tech_wuliao.entity.TechGoods;
import org.springframework.stereotype.Repository;

/**
 * description
 *
 * @author wuye 2021/09/03 16:08
 */

@Repository
public interface TechGoodsMapper {

    List<TechGoods> get(String wuliaoNum);

}
