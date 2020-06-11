package com.cch.goods.provider.service;

import com.cch.goods.provider.beans.Goods;

import java.util.List;

/**
 * Created by codedrinker on 2020-06-11 15:01:03
 */
public interface GoodsService {
    public List<Goods> listGoods(Integer pageNum, Integer pageSize);
}
