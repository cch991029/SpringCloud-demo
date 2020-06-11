package com.cch.goods.provider.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by codedrinker on 2020-06-11 14:46:21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
    private String id;
    private String name;
    private double price;
}
