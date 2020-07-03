package com.highsensor.website.backstage.entity.vo;

import com.highsensor.website.backstage.entity.Banner;
import lombok.Data;

@Data
public class BannerVO {
    /**
     * 轮播图id
     */
    private Integer id;

    /**
     * 轮播图地址
     */
    private String image;

    /**
     * 轮播图标题
     */
    private String title;

    public BannerVO(Banner banner) {
        this.id = banner.getId();
        this.image = banner.getImage();
        this.title = banner.getTitle();
    }
}
