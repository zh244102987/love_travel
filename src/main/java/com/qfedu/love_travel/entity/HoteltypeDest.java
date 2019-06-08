package com.qfedu.love_travel.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 酒店分类-目的地中间表
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
@TableName("hoteltype_dest")
public class HoteltypeDest implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 序号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 酒店分类序号
     */
    private Integer hoteltypeid;
    /**
     * 目的地序号
     */
    private Integer destid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHoteltypeid() {
        return hoteltypeid;
    }

    public void setHoteltypeid(Integer hoteltypeid) {
        this.hoteltypeid = hoteltypeid;
    }

    public Integer getDestid() {
        return destid;
    }

    public void setDestid(Integer destid) {
        this.destid = destid;
    }

    @Override
    public String toString() {
        return "HoteltypeDest{" +
        ", id=" + id +
        ", hoteltypeid=" + hoteltypeid +
        ", destid=" + destid +
        "}";
    }
}
