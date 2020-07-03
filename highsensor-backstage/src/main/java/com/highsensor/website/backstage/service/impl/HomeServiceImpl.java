package com.highsensor.website.backstage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.highsensor.website.backstage.entity.Home;
import com.highsensor.website.backstage.entity.dto.home.HomeDTO;
import com.highsensor.website.backstage.mapper.HomeMapper;
import com.highsensor.website.backstage.service.HomeService;
import com.highsensor.website.common.constants.ResultCodeEnum;
import com.highsensor.website.common.exception.HighSensorException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author changyong
 * @since 2020-06-27
 */
@Service
@Slf4j
public class HomeServiceImpl extends ServiceImpl<HomeMapper, Home> implements HomeService {

    @Override
    public void createHome(HomeDTO homeDTO) {
        Home home = new Home();
        if (nameIsExist(homeDTO
        .getModuleName())) {
            log.error("[插入首页模块] 失败! 因为该模块已经存在");
            throw new HighSensorException(ResultCodeEnum.HOME_MODULE_IS_EXIST);
        }
        BeanUtils.copyProperties(homeDTO, home);
        int insert = baseMapper.insert(home);
        log.info("[插入首页模块] 成功:{}", insert);
    }

    @Override
    public Home getHomeByName(String name) {
        return baseMapper.selectOne(new QueryWrapper<Home>().lambda().eq(Home::getModuleName, name));
    }

    @Override
    public boolean nameIsExist(String name) {
        return baseMapper.selectOne(new QueryWrapper<Home>().lambda().eq(Home::getModuleName, name)) != null;
    }
}
