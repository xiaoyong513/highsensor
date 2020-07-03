package com.highsensor.website.backstage.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author changyong
 * @since 2020-06-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Industry对象", description="")
@Table(name = "industry")
public class Industry extends BaseEntity<Industry> implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "图片地址")
    @Column
    private String image;

    @ApiModelProperty(value = "图片标题")
    @Column
    private String title;

    @ApiModelProperty(value = "排序字段")
    @Column(comment = "排序字段")
    private Integer sort;

    @ApiModelProperty(value = "是否显示 1（true）显示， 0（false）不显示")
    @Column(comment = "是否显示 1（true）显示， 0（false）不显示", defaultValue = "1")
    private Boolean isShow;
}
