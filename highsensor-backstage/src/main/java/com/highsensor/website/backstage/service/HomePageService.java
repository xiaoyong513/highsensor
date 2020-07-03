package com.highsensor.website.backstage.service;

import com.highsensor.website.backstage.entity.vo.HomePageVO;

public interface HomePageService {

    /**
     * 获取首页详细信息
     *
     * @return
     */
    HomePageVO getHomePageInfo();
}
