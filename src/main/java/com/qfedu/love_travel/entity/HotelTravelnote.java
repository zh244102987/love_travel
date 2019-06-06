package com.qfedu.love_travel.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 酒店-游记中间表
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
@TableName("hotel_travelnote")
public class HotelTravelnote implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 序号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 酒店序号
     */
    private Integer hotelid;
    /**
     * 游记序号
     */
    private Integer travelnoteid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHotelid() {
        return hotelid;
    }

    public void setHotelid(Integer hotelid) {
        this.hotelid = hotelid;
    }

    public Integer getTravelnoteid() {
        return travelnoteid;
    }

    public void setTravelnoteid(Integer travelnoteid) {
        this.travelnoteid = travelnoteid;
    }

    @Override
    public String toString() {
        return "HotelTravelnote{" +
        ", id=" + id +
        ", hotelid=" + hotelid +
        ", travelnoteid=" + travelnoteid +
        "}";
    }
}
