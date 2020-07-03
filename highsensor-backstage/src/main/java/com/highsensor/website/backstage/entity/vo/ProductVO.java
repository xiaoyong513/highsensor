package com.highsensor.website.backstage.entity.vo;

import com.highsensor.website.backstage.entity.Product;
import lombok.Data;

@Data
public class ProductVO {
    /**
     * 产品id
     */
    private Integer id;

    /**
     * 产品图地址
     */
    private String image;

    /**
     * 产品标题
     */
    private String title;

    /**
     * 产品详情
     */
    private String info;

    /**
     * 产品二维码
     */
    private String qrCode;

    public ProductVO(Product product) {
        this.id = product.getId();
        this.image = product.getImage();
        this.title = product.getTitle();
        this.info = product.getInfo();
        this.qrCode = product.getQrCode();
    }
}
