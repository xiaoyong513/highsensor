package com.highsensor.website.backstage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.highsensor.website.backstage.entity.Banner;
import com.highsensor.website.backstage.entity.dto.banner.BannerDTO;
import com.highsensor.website.backstage.entity.query.QueryBanner;
import com.highsensor.website.backstage.entity.vo.BannerVO;
import com.highsensor.website.backstage.mapper.BannerMapper;
import com.highsensor.website.backstage.service.BannerService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author changyong
 * @since 2020-06-17
 */
@Service
@Slf4j
public class BannerServiceImpl extends ServiceImpl<BannerMapper, Banner> implements BannerService {

    @Override
    public void createBanner(BannerDTO bannerDTO) {
        Banner banner = new Banner();
        BeanUtils.copyProperties(bannerDTO, banner);
        int insert = baseMapper.insert(banner);
        log.info("[添加轮播图] 成功,result:{}", insert);
    }

    @Override
    public void getBannerList(Page<Banner> bannerPage, QueryBanner queryBanner) {
        QueryWrapper<Banner> queryWrapper = new QueryWrapper<>();
        if (queryBanner == null) {
            queryWrapper.orderByAsc("sort", "modified_time");
            baseMapper.selectPage(bannerPage, queryWrapper);
            return;
        }

        if (StringUtils.isNotBlank(queryBanner.getTitle())) {
            queryWrapper.like("title", queryBanner.getTitle());
        }
        if (queryBanner != null) {
            queryWrapper.eq("is_show", queryBanner.getIsShow());
        }
        queryWrapper.orderByAsc("sort", "modified_time");
        baseMapper.selectPage(bannerPage, queryWrapper);
    }

    @Override
    public List<BannerVO> getBannerList(long page, long limit, QueryBanner queryBanner) {
        Page<Banner> bannerPage = new Page<>(page, limit);
        getBannerList(bannerPage, queryBanner);
        List<Banner> records = bannerPage.getRecords();
        List<BannerVO> collect = records.parallelStream().map(e -> new BannerVO(e)).collect(Collectors.toList());
        return collect;
    }

    @Override
    public List<BannerVO> getBannerList(QueryBanner queryBanner) {
        QueryWrapper<Banner> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByAsc("sort", "modified_time");
        List<Banner> banners;
        if (queryBanner != null) {
            if (StringUtils.isNotBlank(queryBanner.getTitle())) {
                queryWrapper.like("title", queryBanner.getTitle());
            }
            if (queryBanner != null) {
                queryWrapper.eq("is_show", queryBanner.getIsShow());
            }
        }
        banners = baseMapper.selectList(queryWrapper);
        List<BannerVO> collect = banners.parallelStream().map(e -> new BannerVO(e)).collect(Collectors.toList());
        return collect;
    }

    @Override
    public List<BannerVO> getBannerList() {
        QueryBanner queryBanner = new QueryBanner();
        queryBanner.setIsShow(true);
        return getBannerList(queryBanner);
    }

}
