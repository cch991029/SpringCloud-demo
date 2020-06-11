package com.cch.goods.provider.service.impl;

import com.cch.goods.provider.beans.Goods;
import com.cch.goods.provider.service.GoodsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codedrinker on 2020-06-11 15:02:15
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Override
    public List<Goods> listGoods(Integer pageNum, Integer pageSize) {
        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(new Goods("101","笔记本",6666.66));
        goodsList.add(new Goods("102","手机",5555.55));
        goodsList.add(new Goods("103","内存条",4444.44));
        return goodsList;
    }
}
