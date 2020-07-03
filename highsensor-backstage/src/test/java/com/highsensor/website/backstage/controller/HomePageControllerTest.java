package com.highsensor.website.backstage.controller;

import com.highsensor.website.common.vo.R;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
@Slf4j
class HomePageControllerTest {

    @Autowired
    private HomePageController homePageController;
    @Test
    void getHomePageInfo() {
        R homePageInfo = homePageController.getHomePageInfo();
        log.info("信息");
        log.info("首页信息:{}", homePageInfo.getData().get("homePage"));
    }
}