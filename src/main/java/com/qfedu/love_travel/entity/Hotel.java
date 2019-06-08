package com.qfedu.love_travel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;

import java.io.Serializable;

/**
 * <p>
 * 酒店
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
@TableName("hotel")
public class Hotel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 序号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 酒店名称
     */
    private String hotelname;
    /**
     * 目的地(城区)
     */
    private Integer destid;
    /**
     * 封面图
     */
    private String imgurl;
    /**
     * 评论数
     */
    private Integer commentcount;
    /**
     * 游记数
     */
    private Integer notecount;
    /**
     * 评分
     */
    private BigDecimal rating;
    /**
     * 简介
     */
    private String intro;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public Integer getDestid() {
        return destid;
    }

    public void setDestid(Integer destid) {
        this.destid = destid;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public Integer getCommentcount() {
        return commentcount;
    }

    public void setCommentcount(Integer commentcount) {
        this.commentcount = commentcount;
    }

    public Integer getNotecount() {
        return notecount;
    }

    public void setNotecount(Integer notecount) {
        this.notecount = notecount;
    }

    public BigDecimal getRating() {
        return rating;
    }

    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Override
    public String toString() {
        return "Hotel{" +
        ", id=" + id +
        ", hotelname=" + hotelname +
        ", destid=" + destid +
        ", imgurl=" + imgurl +
        ", commentcount=" + commentcount +
        ", notecount=" + notecount +
        ", rating=" + rating +
        ", intro=" + intro +
        "}";
    }
}
