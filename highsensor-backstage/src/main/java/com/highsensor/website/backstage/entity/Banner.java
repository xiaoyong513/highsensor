package com.highsensor.website.backstage.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

import static com.baomidou.mybatisplus.annotation.SqlCondition.LIKE;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "Banner对象", description = "轮播图表")
@Table(name = "banner")
public class Banner extends BaseEntity<Banner> implements Serializable {
    private static final long serialVersionUID = -2912598555748722406L;

    /**
     * 名称
     */
    @ApiModelProperty(value = "轮播图标题")
    @TableField(value = "title", condition = LIKE)
    @Column(comment = "轮播图标题")
    private String title;

    @ApiModelProperty(value = "轮播图地址")
    @Column(comment = "轮播图地址")
    private String image;

    @ApiModelProperty(value = "排序字段")
    @Column(comment = "排序字段")
    private Integer sort;

    @ApiModelProperty(value = "是否显示 1（true）显示， 0（false）不显示")
    @Column(comment = "是否显示 1（true）显示， 0（false）不显示", defaultValue = "1")
    private Boolean isShow;

}
