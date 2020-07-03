package com.highsensor.website.backstage.entity.vo;

import lombok.Data;

@Data
public class HomePageVO {


    private HomeVO banner;

    private HomeVO industry;

    private HomeVO product;

    private HomeVO news;

    /**
     * 关于我们
     */
    private HomeVO homeAboutUsVO;
}
