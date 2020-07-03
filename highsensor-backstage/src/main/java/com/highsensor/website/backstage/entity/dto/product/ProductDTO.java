package com.highsensor.website.backstage.entity.dto.product;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "ProductDTO", description = "产品列表")
public class ProductDTO {
    private String title;

    private String image;

    private Integer sort;

    private String info;

    private String qrCode;
}
