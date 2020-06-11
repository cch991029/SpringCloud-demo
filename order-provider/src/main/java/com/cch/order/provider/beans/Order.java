package com.cch.order.provider.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by codedrinker on 2020-06-11 17:03:08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private String id;
    private String desc;
}
