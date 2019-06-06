package com.qfedu.love_travel.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 酒店详情与酒店配套中间表
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
@TableName("hoteldetail_supporting")
public class HoteldetailSupporting implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 序号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 酒店详情序号
     */
    private Integer hoteldetailid;
    /**
     * 酒店配套序号
     */
    private Integer supportingid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHoteldetailid() {
        return hoteldetailid;
    }

    public void setHoteldetailid(Integer hoteldetailid) {
        this.hoteldetailid = hoteldetailid;
    }

    public Integer getSupportingid() {
        return supportingid;
    }

    public void setSupportingid(Integer supportingid) {
        this.supportingid = supportingid;
    }

    @Override
    public String toString() {
        return "HoteldetailSupporting{" +
        ", id=" + id +
        ", hoteldetailid=" + hoteldetailid +
        ", supportingid=" + supportingid +
        "}";
    }
}
