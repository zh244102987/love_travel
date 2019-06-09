package com.qfedu.love_travel.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 段继亮
 * @create 2019-06-09 15:11
 * @desc 游记详情VO类
 **/
@Data
public class VTravelNoteInfo {

    private Integer id;
    private Integer travelnoteid;
    private String coverimgurl;
    private String title;
    private Integer userid;
    private Date starttime;
    private Integer traveldays;
    private Integer relationshipid;
    private BigDecimal percost;
    private String info;
    private Integer aboutnote1id;
    private Integer aboutnote2id;
    private Integer aboutnote3id;
    private Integer aboutdestinationid;
    private Integer collectcount;
    private Integer sharecount;
    private Integer fontcount;
    private Integer imagecount;
    private Integer clickcount;
    private Date createtime;
    private String realname;
    private String headimgurl;
    /**
     * 关系人物名称
     */
    private String rname;
    /**
     * 目的地名称
     */
    private String destname;
    /**
     * 目的地图片
     */
    private String destimgurl;
}
