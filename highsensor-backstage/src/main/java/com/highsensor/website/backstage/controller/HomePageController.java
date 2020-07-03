package com.highsensor.website.backstage.controller;

import com.highsensor.website.backstage.service.HomePageService;
import com.highsensor.website.backstage.entity.vo.*;
import com.highsensor.website.common.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
@CrossOrigin
public class HomePageController {

    @Autowired
    private HomePageService homePageService;

    @GetMapping("info")
    public R getHomePageInfo() {
        HomePageVO homePageInfo = homePageService.getHomePageInfo();
        return R.ok().data("homePage", homePageInfo);
    }
}
