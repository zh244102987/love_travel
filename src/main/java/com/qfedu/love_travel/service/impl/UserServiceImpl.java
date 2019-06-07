package com.qfedu.love_travel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qfedu.love_travel.dao.UserMapper;
import com.qfedu.love_travel.entity.User;
import com.qfedu.love_travel.service.UserService;
import com.qfedu.love_travel.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    private MD5 md5;

    @Override
    public User Login(String phone,String loginpassword) {

        User user = userMapper.selectByPhone(phone);
        if(user == null){
            throw new RuntimeException("账户不存在");
        }
        if(!user.getLoginpassword().equals(loginpassword)){
            throw new RuntimeException("密码错误");
        }
        return user;
    }


}
