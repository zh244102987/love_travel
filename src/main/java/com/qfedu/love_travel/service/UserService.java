package com.qfedu.love_travel.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.qfedu.love_travel.entity.User;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public interface UserService extends IService<User> {


    public User Login(String phone,String loginpassword) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    public void addUser(User user, String code, String loginpassword1) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    public User findByPhone(String phone);


}