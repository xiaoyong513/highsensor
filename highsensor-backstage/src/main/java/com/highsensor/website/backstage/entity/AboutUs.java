package com.highsensor.website.backstage.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
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
@ApiModel(value="AboutUs对象", description="")
@Table(name = "about_us")
public class AboutUs extends BaseEntity<AboutUs> implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "标题")
    @Column
    private String title;

    @ApiModelProperty(value = "英文标题")
    @TableField("title_en")
    @Column
    private String titleEN;

    @ApiModelProperty(value = "详细信息")
    @Column(comment = "详细信息", type = MySqlTypeConstant.LONGTEXT)
    private String info;

    @ApiModelProperty(value = "视频地址")
    @Column(comment = "视频地址")
    private String video;


    @ApiModelProperty(value = "排序字段")
    @Column(comment = "排序字段")
    private Integer sort;

    @ApiModelProperty(value = "是否显示 1（true）显示， 0（false）不显示")
    @Column(comment = "是否显示 1（true）显示， 0（false）不显示", defaultValue = "1")
    private Boolean isShow;
}
