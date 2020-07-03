package com.highsensor.website.backstage.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.highsensor.website.backstage.entity.News;
import com.highsensor.website.backstage.entity.dto.news.NewsDTO;
import com.highsensor.website.backstage.entity.query.QueryNews;
import com.highsensor.website.backstage.entity.vo.NewsVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author changyong
 * @since 2020-06-17
 */
public interface NewsService extends IService<News> {
    void createNews(NewsDTO newsDTO);

    void getNewsList(Page<News> industryPage, QueryNews queryNews);

    List<NewsVO> getNewsList(long page, long limit, QueryNews queryNews);

    List<NewsVO> getNewsList(long page, long limit);

    List<NewsVO> getNewsList(QueryNews queryNews);

    List<NewsVO> getNewsList();
}
