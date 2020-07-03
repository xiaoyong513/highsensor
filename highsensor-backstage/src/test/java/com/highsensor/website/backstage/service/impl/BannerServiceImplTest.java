package com.highsensor.website.backstage.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.highsensor.website.backstage.HighSensorApplication;
import com.highsensor.website.backstage.entity.Banner;
import com.highsensor.website.backstage.entity.dto.banner.BannerDTO;
import com.highsensor.website.backstage.service.BannerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = HighSensorApplication.class)
class BannerServiceImplTest {

    @Autowired
    private BannerService bannerService;

    @Test
    void createBanner() {
        BannerDTO bannerDTO = new BannerDTO();
        bannerDTO.setTitle("地球");
        bannerDTO.setImage("/img/swiper01.jpg");
        bannerDTO.setSort(1);
        bannerService.createBanner(bannerDTO);

        BannerDTO bannerDTO2 = new BannerDTO();
        bannerDTO2.setTitle("芯片");
        bannerDTO2.setImage("/img/swiper02.jpg");
        bannerDTO2.setSort(2);
        bannerService.createBanner(bannerDTO2);
    }

    @Test
    public void testGetBannerList() throws Exception {
        Page<Banner> page = new Page<>(1, 5);
        bannerService.getBannerList(page, null);
        page.getRecords().forEach(e -> System.out.println(e));
    }
}