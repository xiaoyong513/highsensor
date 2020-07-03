package com.highsensor.website.backstage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.highsensor.website.backstage.entity.Industry;
import com.highsensor.website.backstage.entity.dto.industry.IndustryDTO;
import com.highsensor.website.backstage.entity.query.QueryIndustry;
import com.highsensor.website.backstage.entity.vo.IndustryVO;
import com.highsensor.website.backstage.mapper.IndustryMapper;
import com.highsensor.website.backstage.service.IndustryService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author changyong
 * @since 2020-06-17
 */
@Service
public class IndustryServiceImpl extends ServiceImpl<IndustryMapper, Industry> implements IndustryService {

    private final static Logger log = LoggerFactory.getLogger(IndustryServiceImpl.class);

    @Override
    public void createIndustry(IndustryDTO industryDTO) {
        Industry industry = new Industry();
        BeanUtils.copyProperties(industryDTO, industry);
        int insert = baseMapper.insert(industry);
        log.info("[添加经营产业] 成功,result:{}", insert);
    }

    @Override
    public void getIndustryList(Page<Industry> industryPage, QueryIndustry queryIndustry) {
        QueryWrapper<Industry> queryWrapper = new QueryWrapper<>();
        if (queryIndustry == null) {
            queryWrapper.orderByAsc("sort", "modified_time");
            baseMapper.selectPage(industryPage, queryWrapper);
            return;
        }

        if (StringUtils.isNotBlank(queryIndustry.getTitle())) {
            queryWrapper.like("title", queryIndustry.getTitle());
        }
        if (queryIndustry != null) {
            queryWrapper.eq("is_show", queryIndustry.getIsShow());
        }
        queryWrapper.orderByAsc("sort", "modified_time");
        baseMapper.selectPage(industryPage, queryWrapper);
    }

    @Override
    public List<IndustryVO> getIndustryList(long page, long limit, QueryIndustry queryIndustry) {
        Page<Industry> industryPage = new Page<>(page, limit);
        getIndustryList(industryPage, queryIndustry);
        List<Industry> records = industryPage.getRecords();
        List<IndustryVO> collect = records.parallelStream().map(e -> new IndustryVO(e)).collect(Collectors.toList());
        return collect;
    }

    @Override
    public List<IndustryVO> getIndustryList(QueryIndustry queryIndustry) {
        QueryWrapper<Industry> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByAsc("sort", "modified_time");
        List<Industry> Industries;
        if (queryIndustry != null) {
            if (StringUtils.isNotBlank(queryIndustry.getTitle())) {
                queryWrapper.like("title", queryIndustry.getTitle());
            }
            if (queryIndustry != null) {
                queryWrapper.eq("is_show", queryIndustry.getIsShow());
            }
        }
        Industries = baseMapper.selectList(queryWrapper);
        List<IndustryVO> collect = Industries.parallelStream().map(e -> new IndustryVO(e)).collect(Collectors.toList());
        return collect;
    }

    @Override
    public List<IndustryVO> getIndustryList() {
        QueryIndustry queryIndustry = new QueryIndustry();
        queryIndustry.setIsShow(true);
        return getIndustryList(queryIndustry);
    }

}
