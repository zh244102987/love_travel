package com.qfedu.love_travel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

import java.io.Serializable;

/**
 * <p>
 * 酒店评论
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
@TableName("hotelcomment")
public class Hotelcomment implements Serializable {

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
     * 用户序号
     */
    private Integer userid;
    /**
     * 评论时间
     */
    private Date createtime;
    /**
     * 评论内容
     */
    private String info;


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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Hotelcomment{" +
        ", id=" + id +
        ", hoteldetailid=" + hoteldetailid +
        ", userid=" + userid +
        ", createtime=" + createtime +
        ", info=" + info +
        "}";
    }
}
