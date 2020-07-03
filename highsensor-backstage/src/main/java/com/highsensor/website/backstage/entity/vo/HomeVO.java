package com.highsensor.website.backstage.entity.vo;

import lombok.Data;

import java.util.Collection;

@Data
public class HomeVO <T>{
    private String name;

    private String info;

    /**
     * 产品展示列表
     */
    private Collection<T> collection;
}
