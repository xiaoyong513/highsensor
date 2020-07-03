package com.highsensor.website.backstage.service.impl;

import com.highsensor.website.backstage.HighSensorApplication;
import com.highsensor.website.backstage.entity.dto.industry.IndustryDTO;
import com.highsensor.website.backstage.service.IndustryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest(classes = HighSensorApplication.class)
class IndustryServiceImplTest {

    @Autowired
    private IndustryService industryService;
    @Test
    void createIndustryService() {
        IndustryDTO industryDTO = new IndustryDTO();
        industryDTO.setImage("/img/industry001.jpg");
        industryDTO.setSort(1);
        industryDTO.setTitle("小酷云驾考");
        industryService.createIndustry(industryDTO);

        IndustryDTO industryDTO2 = new IndustryDTO();
        industryDTO2.setImage("/img/industry002.jpg");
        industryDTO2.setSort(2);
        industryDTO2.setTitle("汽车方案");
        industryService.createIndustry(industryDTO2);

        IndustryDTO industryDTO3 = new IndustryDTO();
        industryDTO3.setImage("/img/industry003.jpg");
        industryDTO3.setSort(3);
        industryDTO3.setTitle("摩托车方案");
        industryService.createIndustry(industryDTO3);
    }

    @Test
    void getBannerList() {
    }

    @Test
    void getIndustryList() {
    }

    @Test
    void testGetIndustryList() {
    }
}