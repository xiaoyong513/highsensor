package com.highsensor.website.backstage.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

//@MappedSuperclass
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class BaseEntity<T extends BaseEntity> {
    @TableId(value = "id", type = IdType.AUTO)
    @Column
    @IsKey
    @IsAutoIncrement
    private Integer id;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    @Column(comment = "创建时间", type = MySqlTypeConstant.DATETIME)
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    @Column(comment = "修改时间", type = MySqlTypeConstant.DATETIME)
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date modifiedTime;

    @ApiModelProperty(value = "逻辑删除 1（true）已删除， 0（false）未删除")
    @Column(comment = "逻辑删除 1（true）已删除， 0（false）未删除", defaultValue = "0")
    @TableLogic
    private Boolean isDeleted;

    public Integer getId() {
        return id;
    }

    public T setId(Integer id) {
        this.id = id;
        return (T) this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public T setCreateTime(Date createTime) {
        this.createTime = createTime;
        return (T) this;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public T setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
        return (T) this;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public T setDeleted(Boolean deleted) {
        isDeleted = deleted;
        return (T) this;
    }
}
