package com.highsensor.website.backstage.service.impl;

import com.highsensor.website.backstage.HighSensorApplication;
import com.highsensor.website.backstage.entity.dto.product.ProductDTO;
import com.highsensor.website.backstage.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = HighSensorApplication.class)
class ProductServiceImplTest {

    @Autowired
    private ProductService productService;

    @Test
    void createProductService() {
        ProductDTO productDTO1 = new ProductDTO("第一个产品",
                "/img/product001.jpg", 1,
                "【太平洋汽车网 行业频道】日前，" +
                "前锤子科技CEO罗永浩（江湖人称“老罗”）发微博“狂吹”了一波理想ONE而引发了网友热议。" +
                "据罗永浩表示，因为直播带货效果还不错，公司为其配一辆代步车，预算是500万以下任选，" +
                "而老罗最终选择了售价为30多万的理想ONE，并宣称，“理想ONE是你能在这个价位买到的全世界最好的车，" +
                "即使是跟比它（理想ONE）贵几倍的车比，它也几乎是完全没有对手的。”",
                "/img/联系我们qr.png");
        productService.createProduct(productDTO1);

        ProductDTO productDTO2 = new ProductDTO("第二个产品", "/img/product002.jpg", 2,
                "【太平洋汽车网 行业频道】日前，" +
                        "前锤子科技CEO罗永浩（江湖人称“老罗”）发微博“狂吹”了一波理想ONE而引发了网友热议。" +
                        "据罗永浩表示，因为直播带货效果还不错，公司为其配一辆代步车，预算是500万以下任选，" +
                        "而老罗最终选择了售价为30多万的理想ONE，并宣称，“理想ONE是你能在这个价位买到的全世界最好的车，" +
                        "即使是跟比它（理想ONE）贵几倍的车比，它也几乎是完全没有对手的。”", "/img/联系我们qr.png");
        productService.createProduct(productDTO2);

        ProductDTO productDTO3 = new ProductDTO("第三个产品", "/img/product003.jpg", 3,
                "【太平洋汽车网 行业频道】日前，" +
                        "前锤子科技CEO罗永浩（江湖人称“老罗”）发微博“狂吹”了一波理想ONE而引发了网友热议。" +
                        "据罗永浩表示，因为直播带货效果还不错，公司为其配一辆代步车，预算是500万以下任选，" +
                        "而老罗最终选择了售价为30多万的理想ONE，并宣称，“理想ONE是你能在这个价位买到的全世界最好的车，" +
                        "即使是跟比它（理想ONE）贵几倍的车比，它也几乎是完全没有对手的。”", "/img/联系我们qr.png");
        productService.createProduct(productDTO3);

        ProductDTO productDTO4 = new ProductDTO("第四个产品", "/img/product004.jpg", 4,
                "【太平洋汽车网 行业频道】日前，" +
                        "前锤子科技CEO罗永浩（江湖人称“老罗”）发微博“狂吹”了一波理想ONE而引发了网友热议。" +
                        "据罗永浩表示，因为直播带货效果还不错，公司为其配一辆代步车，预算是500万以下任选，" +
                        "而老罗最终选择了售价为30多万的理想ONE，并宣称，“理想ONE是你能在这个价位买到的全世界最好的车，" +
                        "即使是跟比它（理想ONE）贵几倍的车比，它也几乎是完全没有对手的。”", "/img/联系我们qr.png");
        productService.createProduct(productDTO4);

        ProductDTO productDTO5 = new ProductDTO("第五个产品", "/img/product005.jpg", 5,
                "【太平洋汽车网 行业频道】日前，" +
                        "前锤子科技CEO罗永浩（江湖人称“老罗”）发微博“狂吹”了一波理想ONE而引发了网友热议。" +
                        "据罗永浩表示，因为直播带货效果还不错，公司为其配一辆代步车，预算是500万以下任选，" +
                        "而老罗最终选择了售价为30多万的理想ONE，并宣称，“理想ONE是你能在这个价位买到的全世界最好的车，" +
                        "即使是跟比它（理想ONE）贵几倍的车比，它也几乎是完全没有对手的。”", "/img/联系我们qr.png");
        productService.createProduct(productDTO5);
    }

    @Test
    void getProductList() {
    }

    @Test
    void testGetProductList() {
    }

    @Test
    void testGetProductList1() {
    }
}