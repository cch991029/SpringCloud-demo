package com.cch.goods.provider.controller;

import com.cch.goods.provider.beans.Goods;
import com.cch.goods.provider.service.GoodsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by codedrinker on 2020-06-11 15:05:52
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Resource
    private GoodsService goodsService;

    @RequestMapping(value = "/listGoods",method = RequestMethod.GET)
    public List<Goods> listGoods(Integer pageNum, Integer pageSize){
        return goodsService.listGoods(pageNum, pageSize);
    }
}
