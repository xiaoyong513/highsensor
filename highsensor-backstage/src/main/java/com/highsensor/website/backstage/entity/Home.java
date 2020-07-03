package com.highsensor.website.backstage.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value = "Home", description = "")
@Table(name = "home")
public class Home extends BaseEntity<Home> implements Serializable {
    private static final long serialVersionUID = -2695590947165210424L;

    @Column
    private String moduleName;

    @Column(type = MySqlTypeConstant.TEXT)
    private String moduleInfo;

    @ApiModelProperty(value = "是否显示 1（true）显示， 0（false）不显示")
    @Column(comment = "是否显示 1（true）显示， 0（false）不显示", defaultValue = "1")
    private Boolean isShow;
}
