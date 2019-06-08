package com.qfedu.love_travel.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qfedu.love_travel.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface UserMapper extends BaseMapper<User> {

    @Select("select * from user where phone=#{phone}")
    public User selectByPhone(String phone);

    @Insert("insert into user(phone,loginpassword,email,realname,flag,reamin,regtime,headimgurl,address) values(#{phone},#{loginpassword},#{email},#{realname},#{flag},#{reamin},#{regtime},#{headimgurl},#{address})")
    public void addUser(User user1);

    //判断用户的账号是否存在，如果不存在则添加，存在则提示
    @Select("select * from user where phone=#{phone}")
    public List<User> booleanUserPhone(String phone);
}
