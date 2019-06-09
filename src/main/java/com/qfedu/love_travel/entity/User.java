package com.qfedu.love_travel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

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
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date regtime;
    private String headimgurl;
    private String address;
}
