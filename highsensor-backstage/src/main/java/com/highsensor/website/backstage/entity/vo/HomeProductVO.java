package com.highsensor.website.backstage.entity.vo;

import lombok.Data;

import java.util.Collection;

@Data
public class HomeProductVO {
    /**
     * 产品展示列表
     */
    private Collection<ProductVO> products;
}
