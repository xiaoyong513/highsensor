package com.highsensor.website.backstage.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

import static com.baomidou.mybatisplus.annotation.SqlCondition.LIKE;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author changyong
 * @since 2020-04-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="User对象", description="用户表")
@Table(name = "user")
public class User extends BaseEntity<User> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名")
    @NotEmpty(message = "姓名不能为空")
    @Length(max = 50, message = "姓名长度不能超过50")
    @TableField(value = "name", condition = LIKE)
    @Column
    private String name;

    @ApiModelProperty(value = "微信openid")
    @Column
    private String openid;

    @ApiModelProperty(value = "手机号")
    @Column
    private String mobile;

    @ApiModelProperty(value = "密码")
    @Column
    private String password;

    @ApiModelProperty(value = "昵称")
    @Column
    private String nickname;

    @ApiModelProperty(value = "性别 1 女，2 男")
    @Column
    private Integer sex;

    @ApiModelProperty(value = "年龄")
    @Column
    private Integer age;

    @ApiModelProperty(value = "用户头像")
    @Column
    private String avatar;

    @ApiModelProperty(value = "用户签名")
    @Column
    private String sign;

    @ApiModelProperty(value = "是否禁用 1（true）已禁用，  0（false）未禁用")
    @Column
    private Boolean isDisabled;
}
