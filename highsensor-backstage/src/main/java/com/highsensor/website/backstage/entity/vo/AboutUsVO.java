package com.highsensor.website.backstage.entity.vo;

import lombok.Data;

@Data
public class AboutUsVO {
    /**
     * id
     */
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 英文标题
     */
    private String titleEN;

    /**
     * 详细信息
     */
    private String info;

    /**
     * 视频地址
     */
    private String video;
}
