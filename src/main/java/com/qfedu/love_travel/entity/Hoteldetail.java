package com.qfedu.love_travel.entity;


import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 酒店详情
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
@TableName("hoteldetail")
public class Hoteldetail implements Serializable {

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
     * 酒店名称
     */
    private String hotelname;
    /**
     * 地址
     */
    private String address;
    /**
     * 评分
     */
    private BigDecimal rating;
    /**
     * 评论数
     */
    private Integer commentcount;
    /**
     * 经纬度
     */
    private String gps;
    /**
     * 酒店星级
     */
    private Integer star;
    /**
     * 入住时间段-起
     */
    private Date checkinstart;
    /**
     * 入住时间段-末
     */
    private Date checkinend;
    /**
     * 离店时间
     */
    private Date checkout;
    /**
     * 建成日期
     */
    private Date buildtime;
    /**
     * 酒店规模
     */
    private Integer roomcount;


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

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getRating() {
        return rating;
    }

    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }

    public Integer getCommentcount() {
        return commentcount;
    }

    public void setCommentcount(Integer commentcount) {
        this.commentcount = commentcount;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public Date getCheckinstart() {
        return checkinstart;
    }

    public void setCheckinstart(Date checkinstart) {
        this.checkinstart = checkinstart;
    }

    public Date getCheckinend() {
        return checkinend;
    }

    public void setCheckinend(Date checkinend) {
        this.checkinend = checkinend;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public Date getBuildtime() {
        return buildtime;
    }

    public void setBuildtime(Date buildtime) {
        this.buildtime = buildtime;
    }

    public Integer getRoomcount() {
        return roomcount;
    }

    public void setRoomcount(Integer roomcount) {
        this.roomcount = roomcount;
    }

    @Override
    public String toString() {
        return "Hoteldetail{" +
        ", id=" + id +
        ", hotelid=" + hotelid +
        ", hotelname=" + hotelname +
        ", address=" + address +
        ", rating=" + rating +
        ", commentcount=" + commentcount +
        ", gps=" + gps +
        ", star=" + star +
        ", checkinstart=" + checkinstart +
        ", checkinend=" + checkinend +
        ", checkout=" + checkout +
        ", buildtime=" + buildtime +
        ", roomcount=" + roomcount +
        "}";
    }
}
