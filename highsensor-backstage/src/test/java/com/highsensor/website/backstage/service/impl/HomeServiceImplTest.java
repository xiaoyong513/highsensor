package com.highsensor.website.backstage.service.impl;

import com.highsensor.website.backstage.entity.dto.home.HomeDTO;
import com.highsensor.website.backstage.service.HomeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HomeServiceImplTest {

    @Autowired
    private HomeService homeService;

    @Test
    void createHome() {
        HomeDTO homeDTO1 = new HomeDTO("轮播图", "展示公司主要信息");
        homeService.createHome(homeDTO1);

        HomeDTO homeDTO2 = new HomeDTO("经营产业", "集团成立于2001年6月，是市政府直属的国有全资大型投资集团。经过这些年的不断发展壮大，截至目前，集团公司拥有控参股企业54家，有限合伙企业6家，职工近3万余名，合并资产总额812.48亿元，获得AAA信用等级及“中国企业500强”称号。");
        homeService.createHome(homeDTO2);

        HomeDTO homeDTO3 = new HomeDTO("产品展示", "展示公司主要产品信息");
        homeService.createHome(homeDTO3);

        HomeDTO homeDTO4 = new HomeDTO("新闻中心", "集团成立于2001年6月，是市政府直属的国有全资大型投资集团。经过这些年的不断发展壮大，截至目前，集团公司拥有控参股企业54家，有限合伙企业6家，职工近3万余名，合并资产总额812.48亿元，获得AAA信用等级及“中国企业500强”称号。");
        homeService.createHome(homeDTO4);

        HomeDTO homeDTO5 = new HomeDTO("关于我们", "集团成立于2001年6月，是市政府直属的国有全资大型投资集团。经过这些年的不断发展壮大，截至目前，集团公司拥有控参股企业54家，有限合伙企业6家，职工近3万余名，合并资产总额812.48亿元，获得AAA信用等级及“中国企业500强”称号。\n" +
                "              <br />实业投资集团聚焦先进装备制造、数字经济、新能源新材料、医疗健康、循环经济、产业园区建设等行业，以产业投资和资本运作为抓手，形成对行业领军企业的影响力和控制力。其中橡胶集团有限公司、纸业集团有限公司、高分子材料股份有限公司、油漆有限公司、轻机实业有限公司等均处于国内和行业领先地位。");
        homeService.createHome(homeDTO5);

    }
}