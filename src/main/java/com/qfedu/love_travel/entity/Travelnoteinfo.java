package com.qfedu.love_travel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.util.Date;

import java.io.Serializable;

/**
 * <p>
 * 游记详情
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
@TableName("travelnoteinfo")
public class Travelnoteinfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 序号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 游记序号
     */
    private Integer travelnoteid;
    /**
     * 封面照片
     */
    private String coverimgurl;
    /**
     * 标题
     */
    private String title;
    /**
     * 作者序号
     */
    private Integer userid;
    /**
     * 出发时间
     */
    private Date starttime;
    /**
     * 出行天数
     */
    private Integer traveldays;
    /**
     * 出行人物关系序号
     */
    private Integer relationshipid;
    /**
     * 人均费用
     */
    private BigDecimal percost;
    /**
     * 游记内容
     */
    private String info;
    /**
     * 相关游记1序号
     */
    private Integer aboutnote1id;
    /**
     * 相关游记2序号
     */
    private Integer aboutnote2id;
    /**
     * 相关游记3序号
     */
    private Integer aboutnote3id;
    /**
     * 相关目的地序号
     */
    private Integer aboutdestinationid;
    /**
     * 收藏数
     */
    private Integer collectcount;
    /**
     * 分享数
     */
    private Integer sharecount;
    /**
     * 字数统计
     */
    private Integer fontcount;
    /**
     * 附图统计
     */
    private Integer imagecount;
    /**
     * 浏览量统计
     */
    private Integer clickcount;
    /**
     * 游记发表时间
     */
    private Date createtime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTravelnoteid() {
        return travelnoteid;
    }

    public void setTravelnoteid(Integer travelnoteid) {
        this.travelnoteid = travelnoteid;
    }

    public String getCoverimgurl() {
        return coverimgurl;
    }

    public void setCoverimgurl(String coverimgurl) {
        this.coverimgurl = coverimgurl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Integer getTraveldays() {
        return traveldays;
    }

    public void setTraveldays(Integer traveldays) {
        this.traveldays = traveldays;
    }

    public Integer getRelationshipid() {
        return relationshipid;
    }

    public void setRelationshipid(Integer relationshipid) {
        this.relationshipid = relationshipid;
    }

    public BigDecimal getPercost() {
        return percost;
    }

    public void setPercost(BigDecimal percost) {
        this.percost = percost;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getAboutnote1id() {
        return aboutnote1id;
    }

    public void setAboutnote1id(Integer aboutnote1id) {
        this.aboutnote1id = aboutnote1id;
    }

    public Integer getAboutnote2id() {
        return aboutnote2id;
    }

    public void setAboutnote2id(Integer aboutnote2id) {
        this.aboutnote2id = aboutnote2id;
    }

    public Integer getAboutnote3id() {
        return aboutnote3id;
    }

    public void setAboutnote3id(Integer aboutnote3id) {
        this.aboutnote3id = aboutnote3id;
    }

    public Integer getAboutdestinationid() {
        return aboutdestinationid;
    }

    public void setAboutdestinationid(Integer aboutdestinationid) {
        this.aboutdestinationid = aboutdestinationid;
    }

    public Integer getCollectcount() {
        return collectcount;
    }

    public void setCollectcount(Integer collectcount) {
        this.collectcount = collectcount;
    }

    public Integer getSharecount() {
        return sharecount;
    }

    public void setSharecount(Integer sharecount) {
        this.sharecount = sharecount;
    }

    public Integer getFontcount() {
        return fontcount;
    }

    public void setFontcount(Integer fontcount) {
        this.fontcount = fontcount;
    }

    public Integer getImagecount() {
        return imagecount;
    }

    public void setImagecount(Integer imagecount) {
        this.imagecount = imagecount;
    }

    public Integer getClickcount() {
        return clickcount;
    }

    public void setClickcount(Integer clickcount) {
        this.clickcount = clickcount;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Travelnoteinfo{" +
        ", id=" + id +
        ", travelnoteid=" + travelnoteid +
        ", coverimgurl=" + coverimgurl +
        ", title=" + title +
        ", userid=" + userid +
        ", starttime=" + starttime +
        ", traveldays=" + traveldays +
        ", relationshipid=" + relationshipid +
        ", percost=" + percost +
        ", info=" + info +
        ", aboutnote1id=" + aboutnote1id +
        ", aboutnote2id=" + aboutnote2id +
        ", aboutnote3id=" + aboutnote3id +
        ", aboutdestinationid=" + aboutdestinationid +
        ", collectcount=" + collectcount +
        ", sharecount=" + sharecount +
        ", fontcount=" + fontcount +
        ", imagecount=" + imagecount +
        ", clickcount=" + clickcount +
        ", createtime=" + createtime +
        "}";
    }
}
