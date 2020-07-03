package com.highsensor.website.backstage.service;

import com.highsensor.website.backstage.entity.Home;
import com.baomidou.mybatisplus.extension.service.IService;
import com.highsensor.website.backstage.entity.dto.home.HomeDTO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author changyong
 * @since 2020-06-27
 */
public interface HomeService extends IService<Home> {
    void createHome(HomeDTO homeDTO);

    Home getHomeByName(String name);

    boolean nameIsExist(String name);
}
