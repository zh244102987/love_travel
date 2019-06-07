package com.qfedu.love_travel.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qfedu.love_travel.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;



public interface UserMapper extends BaseMapper<User> {

    //@Select("select * from user where phone=#{phone}")
    public User selectByPhone(String phone);

   // @Insert("insert into user phone#{phone},loginpassword=#{loginpassword},email=#{email},realname=#{realname},flag=#{flag},reamin=#{reamin},regtime=#{regtime},headimgurl=#{headimgurl},address=#{address}")
    //public void addUser(User user);
}
