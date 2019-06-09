package com.qfedu.love_travel.vo;

import lombok.Data;

/**
 * @author 段继亮
 * @create 2019-06-09 10:58
 * @desc 游记信息视图类
 **/
@Data
public class VTravelNote {


    private Integer id;
    private String title;
    private String summary;
    private String sketchimgurl;
    private Integer userid;
    private Integer browsecount;
    private Integer likecount;
    private Integer commentcount;
    private Integer travelnotetypeid;
    private String realname;
    private String headimgurl;
}
