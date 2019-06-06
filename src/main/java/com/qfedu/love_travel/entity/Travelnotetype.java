package com.qfedu.love_travel.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 游记分类
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
@TableName("travelnotetype")
public class Travelnotetype implements Serializable {

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
     * 分类等级
     */
    private Integer typelevel;
    /**
     * 父分类序号
     */
    private Integer pid;


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

    public Integer getTypelevel() {
        return typelevel;
    }

    public void setTypelevel(Integer typelevel) {
        this.typelevel = typelevel;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "Travelnotetype{" +
        ", id=" + id +
        ", name=" + name +
        ", typelevel=" + typelevel +
        ", pid=" + pid +
        "}";
    }
}
