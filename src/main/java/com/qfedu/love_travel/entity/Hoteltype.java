package com.qfedu.love_travel.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 酒店分类
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
@TableName("hoteltype")
public class Hoteltype implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 序号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 分类名称
     */
    private String name;
    /**
     * 父酒店分类序号
     */
    private Integer pid;
    /**
     * 酒店分类等级
     */
    private Integer hoteltypelevel;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getHoteltypelevel() {
        return hoteltypelevel;
    }

    public void setHoteltypelevel(Integer hoteltypelevel) {
        this.hoteltypelevel = hoteltypelevel;
    }

    @Override
    public String toString() {
        return "Hoteltype{" +
        ", id=" + id +
        ", name=" + name +
        ", pid=" + pid +
        ", hoteltypelevel=" + hoteltypelevel +
        "}";
    }
}
