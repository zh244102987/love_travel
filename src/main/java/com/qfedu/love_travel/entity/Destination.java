package com.qfedu.love_travel.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 目的地
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
@TableName("destination")
public class Destination implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 序号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 目的地名称
     */
    private String name;
    /**
     * 父目的地序号
     */
    private Integer pid;
    /**
     * 目的地等级
     */
    private Integer destlevel;


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

    public Integer getDestlevel() {
        return destlevel;
    }

    public void setDestlevel(Integer destlevel) {
        this.destlevel = destlevel;
    }

    @Override
    public String toString() {
        return "Destination{" +
        ", id=" + id +
        ", name=" + name +
        ", pid=" + pid +
        ", destlevel=" + destlevel +
        "}";
    }
}
