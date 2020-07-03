package com.highsensor.website.backstage.entity.vo;

import com.highsensor.website.backstage.entity.News;
import lombok.Data;

@Data
public class NewsVO {
    /**
     * 新闻id
     */
    private Integer id;

    /**
     * 新闻图地址
     */
    private String image;

    /**
     * 新闻标题
     */
    private String title;

    /**
     * 新闻详情
     */
    private String info;

    /**
     * 新闻详情连接
     */
    private String href;

    public NewsVO(News news) {
        this.id = news.getId();
        this.image = news.getImage();
        this.title = news.getTitle();
        this.info = news.getInfo();
        this.href = news.getHref();
    }
}
