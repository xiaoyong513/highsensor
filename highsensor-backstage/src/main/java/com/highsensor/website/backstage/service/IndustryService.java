package com.highsensor.website.backstage.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.highsensor.website.backstage.entity.Industry;
import com.highsensor.website.backstage.entity.dto.industry.IndustryDTO;
import com.highsensor.website.backstage.entity.query.QueryIndustry;
import com.highsensor.website.backstage.entity.vo.IndustryVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author changyong
 * @since 2020-06-17
 */
public interface IndustryService extends IService<Industry> {
    void createIndustry(IndustryDTO industryDTO);

    void getIndustryList(Page<Industry> industryPage, QueryIndustry queryIndustry);

    List<IndustryVO> getIndustryList(long page, long limit, QueryIndustry queryIndustry);

    List<IndustryVO> getIndustryList(QueryIndustry queryIndustry);

    List<IndustryVO> getIndustryList();
}
