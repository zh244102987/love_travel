package com.qfedu.love_travel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;


@Data
@TableName("user")
public class User {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String phone;
    private String loginpassword;
    private String email;
    private String realname;
    private Integer flag;
    private Double reamin;
    private Date regtime;
    private String headimgurl;
    private String address;
}
