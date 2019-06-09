package com.qfedu.love_travel.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author 段继亮
 * @create 2019-06-09 17:45
 * @desc ${DESCRIPTION}
 **/
@Data
public class VTravelNoteComment {


    private Integer id;
    private Integer travelnoteid;
    private Integer userid;
    private Date createtime;
    private String info;
    private String source;
    private String realname;
    private String headimgurl;
}
