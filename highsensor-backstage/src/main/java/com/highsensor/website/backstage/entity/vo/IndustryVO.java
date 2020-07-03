package com.highsensor.website.backstage.entity.vo;

import com.highsensor.website.backstage.entity.Industry;
import lombok.Data;

@Data
public class IndustryVO {
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

    public IndustryVO(Industry industry) {
        this.id = industry.getId();
        this.image = industry.getImage();
        this.title = industry.getTitle();
    }
}
