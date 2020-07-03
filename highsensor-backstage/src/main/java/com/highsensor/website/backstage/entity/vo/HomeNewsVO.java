package com.highsensor.website.backstage.entity.vo;

import lombok.Data;

import java.util.Collection;

@Data
public class HomeNewsVO {

    private String name;

    private String info;

    /**
     * 新闻列表
     */

    private Collection<NewsVO> news;
}
