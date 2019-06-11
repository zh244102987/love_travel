package com.qfedu.love_travel.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author 田宇飞
 * @create 2019-06-09 17:45
 * @desc ${DESCRIPTION}
 **/
@Data
public class VHotelComment {


    private Integer id;
    private Integer hoteldetailid;
    private Integer userid;
    private Date createtime;
    private String info;
    private String realname;
    private String headimgurl;
}
