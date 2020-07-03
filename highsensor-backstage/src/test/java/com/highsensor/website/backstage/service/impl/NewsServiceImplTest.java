package com.highsensor.website.backstage.service.impl;

import com.highsensor.website.backstage.entity.dto.news.NewsDTO;
import com.highsensor.website.backstage.service.NewsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NewsServiceImplTest {

    @Autowired
    private NewsService newsService;

    @Test
    void createNewsService() {
        NewsDTO newsDTO1 = new NewsDTO("新闻中心1", "/img/news001.jpg", 1,
                "【太平洋汽车网 行业频道】日前，前锤子科技CEO罗永浩（江湖人称“老罗”）" +
                        "发微博“狂吹”了一波理想ONE而引发了网友热议。据罗永浩表示，因为直播带货效果还不错，" +
                        "公司为其配一辆代步车，预算是500万以下任选，而老罗最终选择了售价为30多万的理想ONE，" +
                        "并宣称，“理想ONE是你能在这个价位买到的全世界最好的车，即使是跟比它（理想ONE）贵几倍的车比，" +
                        "它也几乎是完全没有对手的。”", "#");
        newsService.createNews(newsDTO1);

        NewsDTO newsDTO2 = new NewsDTO("新闻中心2", "/img/news002.jpg", 2,
                "【太平洋汽车网 行业频道】日前，前锤子科技CEO罗永浩（江湖人称“老罗”）" +
                        "发微博“狂吹”了一波理想ONE而引发了网友热议。据罗永浩表示，因为直播带货效果还不错，" +
                        "公司为其配一辆代步车，预算是500万以下任选，而老罗最终选择了售价为30多万的理想ONE，" +
                        "并宣称，“理想ONE是你能在这个价位买到的全世界最好的车，即使是跟比它（理想ONE）贵几倍的车比，" +
                        "它也几乎是完全没有对手的。”", "#");
        newsService.createNews(newsDTO2);

        NewsDTO newsDTO3 = new NewsDTO("新闻中心3", "/img/news003.jpg", 3,
                "【太平洋汽车网 行业频道】日前，前锤子科技CEO罗永浩（江湖人称“老罗”）" +
                        "发微博“狂吹”了一波理想ONE而引发了网友热议。据罗永浩表示，因为直播带货效果还不错，" +
                        "公司为其配一辆代步车，预算是500万以下任选，而老罗最终选择了售价为30多万的理想ONE，" +
                        "并宣称，“理想ONE是你能在这个价位买到的全世界最好的车，即使是跟比它（理想ONE）贵几倍的车比，" +
                        "它也几乎是完全没有对手的。”", "#");
        newsService.createNews(newsDTO3);
    }

    @Test
    void getNewsList() {
    }

    @Test
    void testGetNewsList() {
    }

    @Test
    void testGetNewsList1() {
    }

    @Test
    void testGetNewsList2() {
    }

    @Test
    void testGetNewsList3() {
    }
}