package com.qfedu.love_travel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

import java.io.Serializable;

/**
 * <p>
 * 游记评论
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
@TableName("travelnotecomment")
public class Travelnotecomment implements Serializable {

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
    /**
     * 评论来源
     */
    private String source;


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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Travelnotecomment{" +
        ", id=" + id +
        ", travelnoteid=" + travelnoteid +
        ", userid=" + userid +
        ", createtime=" + createtime +
        ", info=" + info +
        ", source=" + source +
        "}";
    }
}
