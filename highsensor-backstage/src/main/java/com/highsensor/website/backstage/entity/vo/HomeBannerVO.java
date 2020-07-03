package com.highsensor.website.backstage.entity.vo;

import lombok.Data;

import java.util.Collection;

@Data
public class HomeBannerVO {

    /**
     * 轮播图列表
     */
    private Collection<BannerVO> banners;
}
