package com.highsensor.website.backstage.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.highsensor.website.backstage.entity.Banner;
import com.highsensor.website.backstage.entity.dto.banner.BannerDTO;
import com.highsensor.website.backstage.entity.query.QueryBanner;
import com.highsensor.website.backstage.entity.vo.BannerVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author changyong
 * @since 2020-06-17
 */
public interface BannerService extends IService<Banner> {

   void createBanner(BannerDTO bannerDTO);

   void getBannerList(Page<Banner> bannerPage, QueryBanner queryBanner);

   List<BannerVO> getBannerList(long page, long limit, QueryBanner queryBanner);

   List<BannerVO> getBannerList(QueryBanner queryBanner);

   List<BannerVO> getBannerList();
}
