package com.qfedu.love_travel.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 游记
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
@TableName("travelnote")
public class Travelnote implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 序号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 标题
     */
    private String title;
    /**
     * 概要
     */
    private String summary;
    /**
     * 封面图
     */
    private String sketchimgurl;
    /**
     * 作者序号
     */
    private Integer userid;
    /**
     * 浏览数
     */
    private Integer browsecount;
    /**
     * 点赞数
     */
    private Integer likecount;
    /**
     * 评论数
     */
    private Integer commentcount;
    /**
     * 游记分类序号
     */
    private Integer travelnotetypeid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSketchimgurl() {
        return sketchimgurl;
    }

    public void setSketchimgurl(String sketchimgurl) {
        this.sketchimgurl = sketchimgurl;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getBrowsecount() {
        return browsecount;
    }

    public void setBrowsecount(Integer browsecount) {
        this.browsecount = browsecount;
    }

    public Integer getLikecount() {
        return likecount;
    }

    public void setLikecount(Integer likecount) {
        this.likecount = likecount;
    }

    public Integer getCommentcount() {
        return commentcount;
    }

    public void setCommentcount(Integer commentcount) {
        this.commentcount = commentcount;
    }

    public Integer getTravelnotetypeid() {
        return travelnotetypeid;
    }

    public void setTravelnotetypeid(Integer travelnotetypeid) {
        this.travelnotetypeid = travelnotetypeid;
    }

    @Override
    public String toString() {
        return "Travelnote{" +
        ", id=" + id +
        ", title=" + title +
        ", summary=" + summary +
        ", sketchimgurl=" + sketchimgurl +
        ", userid=" + userid +
        ", browsecount=" + browsecount +
        ", likecount=" + likecount +
        ", commentcount=" + commentcount +
        ", travelnotetypeid=" + travelnotetypeid +
        "}";
    }
}
