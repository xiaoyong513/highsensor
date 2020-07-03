package com.highsensor.website.backstage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.highsensor.website.backstage.entity.News;
import com.highsensor.website.backstage.entity.dto.news.NewsDTO;
import com.highsensor.website.backstage.entity.query.QueryNews;
import com.highsensor.website.backstage.entity.vo.NewsVO;
import com.highsensor.website.backstage.mapper.NewsMapper;
import com.highsensor.website.backstage.service.NewsService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author changyong
 * @since 2020-06-17
 */
@Service
@Slf4j
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements NewsService {

    @Override
    public void createNews(NewsDTO newsDTO) {
        News news = new News();
        BeanUtils.copyProperties(newsDTO, news);
        int insert = baseMapper.insert(news);
        log.info("[添加新闻] 成功,result:{}", insert);
    }

    @Override
    public void getNewsList(Page<News> industryPage, QueryNews queryNews) {
        QueryWrapper<News> queryWrapper = new QueryWrapper<>();
        if (queryNews == null) {
            queryWrapper.orderByAsc("sort", "modified_time");
            baseMapper.selectPage(industryPage, queryWrapper);
            return;
        }

        if (StringUtils.isNotBlank(queryNews.getTitle())) {
            queryWrapper.like("title", queryNews.getTitle());
        }
        if (queryNews != null) {
            queryWrapper.eq("is_show", queryNews.getIsShow());
        }
        queryWrapper.orderByAsc("sort", "modified_time");
        baseMapper.selectPage(industryPage, queryWrapper);
    }

    @Override
    public List<NewsVO> getNewsList(long page, long limit, QueryNews queryNews) {
        Page<News> industryPage = new Page<>(page, limit);
        getNewsList(industryPage, queryNews);
        List<News> records = industryPage.getRecords();
        List<NewsVO> collect = records.parallelStream().map(e -> new NewsVO(e)).collect(Collectors.toList());
        return collect;
    }

    @Override
    public List<NewsVO> getNewsList(long page, long limit) {
        QueryNews queryNews = new QueryNews();
        queryNews.setIsShow(true);
        return getNewsList(page, limit, queryNews);
    }

    @Override
    public List<NewsVO> getNewsList(QueryNews queryNews) {
        QueryWrapper<News> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByAsc("sort", "modified_time");
        List<News> Industries;
        if (queryNews != null) {
            if (StringUtils.isNotBlank(queryNews.getTitle())) {
                queryWrapper.like("title", queryNews.getTitle());
            }
            if (queryNews != null) {
                queryWrapper.eq("is_show", queryNews.getIsShow());
            }
        }
        Industries = baseMapper.selectList(queryWrapper);
        List<NewsVO> collect = Industries.parallelStream().map(e -> new NewsVO(e)).collect(Collectors.toList());
        return collect;
    }

    @Override
    public List<NewsVO> getNewsList() {
        QueryNews queryNews = new QueryNews();
        queryNews.setIsShow(true);
        return getNewsList(queryNews);
    }
}
