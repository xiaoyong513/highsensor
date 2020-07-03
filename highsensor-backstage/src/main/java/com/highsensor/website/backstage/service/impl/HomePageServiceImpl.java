package com.highsensor.website.backstage.service.impl;

import com.highsensor.website.backstage.entity.Home;
import com.highsensor.website.backstage.entity.vo.BannerVO;
import com.highsensor.website.backstage.entity.vo.HomePageVO;
import com.highsensor.website.backstage.entity.vo.HomeVO;
import com.highsensor.website.backstage.entity.vo.IndustryVO;
import com.highsensor.website.backstage.entity.vo.NewsVO;
import com.highsensor.website.backstage.entity.vo.ProductVO;
import com.highsensor.website.backstage.service.AboutUsService;
import com.highsensor.website.backstage.service.BannerService;
import com.highsensor.website.backstage.service.HomePageService;
import com.highsensor.website.backstage.service.HomeService;
import com.highsensor.website.backstage.service.IndustryService;
import com.highsensor.website.backstage.service.NewsService;
import com.highsensor.website.backstage.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class HomePageServiceImpl implements HomePageService {
    @Autowired
    private BannerService bannerService;

    @Autowired
    private IndustryService industryService;

    @Autowired
    private AboutUsService aboutUsService;

    @Autowired
    private ProductService productService;

    @Autowired
    private NewsService newsService;

    @Autowired
    private HomeService homeService;

    @Override
    public HomePageVO getHomePageInfo() {
        HomePageVO homePageVO = new HomePageVO();

        List<BannerVO> bannerList = bannerService.getBannerList();
        Home banner = homeService.getHomeByName("轮播图");
        HomeVO<BannerVO> bannerVO = new HomeVO<>();
        bannerVO.setCollection(bannerList);
        bannerVO.setName(banner.getModuleName());
        bannerVO.setInfo(banner.getModuleInfo());
        homePageVO.setBanner(bannerVO);


        List<IndustryVO> industryList = industryService.getIndustryList();
        Home industry = homeService.getHomeByName("经营产业");
        HomeVO<IndustryVO> industryVO = new HomeVO<>();
        industryVO.setCollection(industryList);
        industryVO.setName(industry.getModuleName());
        industryVO.setInfo(industry.getModuleInfo());
        homePageVO.setIndustry(industryVO);

        List<ProductVO> productList = productService.getProductList(1, 5);
        Home product = homeService.getHomeByName("产品展示");
        HomeVO<ProductVO> productVO = new HomeVO<>();
        productVO.setCollection(productList);
        productVO.setName(product.getModuleName());
        productVO.setInfo(product.getModuleInfo());
        homePageVO.setProduct(productVO);

        List<NewsVO> newsList = newsService.getNewsList();
        Home news = homeService.getHomeByName("新闻中心");
        HomeVO<NewsVO> newsVO = new HomeVO<>();
        newsVO.setCollection(newsList);
        newsVO.setName(news.getModuleName());
        newsVO.setInfo(news.getModuleInfo());
        homePageVO.setNews(newsVO);

        return homePageVO;
    }
}
