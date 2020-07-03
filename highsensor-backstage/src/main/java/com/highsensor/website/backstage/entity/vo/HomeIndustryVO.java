package com.highsensor.website.backstage.entity.vo;

import lombok.Data;

import java.util.Collection;

@Data
public class HomeIndustryVO {

    private String name;

    private String info;

    /**
     * 经营产业列表
     */
    private Collection<IndustryVO> industries;
}
