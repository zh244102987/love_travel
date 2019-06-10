package com.qfedu.love_travel.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.qfedu.love_travel.entity.User;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public interface UserService extends IService<User> {


    public User Login(String phone,String loginpassword) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    public void addUser(User user, String code, String loginpassword1) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    public User findByPhone(String phone);


}