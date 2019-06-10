package com.qfedu.love_travel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qfedu.love_travel.dao.UserMapper;
import com.qfedu.love_travel.entity.User;
import com.qfedu.love_travel.service.UserService;
import com.qfedu.love_travel.util.MD5;
import com.qfedu.love_travel.util.PhoneCode;
import com.qfedu.love_travel.util.StaticPeram;
import com.qfedu.love_travel.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    private MD5 md5 = new MD5();


    @Autowired(required = false)
    private StaticPeram staticPeram;

    @Override
    public User Login(String phone,String loginpassword) throws UnsupportedEncodingException, NoSuchAlgorithmException {

        User user = userMapper.selectByPhone(phone);
        if(user == null){
            throw new RuntimeException("账户不存在");
        }
        if(!md5.checkpassword(loginpassword,user.getLoginpassword())){
            throw new RuntimeException("密码错误");
        }
        return user;

    }


    @Override
    public void addUser(User user,String code,String loginpassword1) throws UnsupportedEncodingException, NoSuchAlgorithmException {


        String code1 = PhoneCode.code;

        User user1 = userMapper.selectByPhone(user.getPhone());
        if (user1 != null){
            throw new RuntimeException("账号已存在");
        }

        if(user.getLoginpassword().equals(loginpassword1)){

            if(!code.equals(PhoneCode.code)){

                throw new RuntimeException("验证码错误");
            }
            if(code == null || code.equals("")){
                throw new RuntimeException("亲，填写验证码");
            }
            String loginpassword = user.getLoginpassword();
            String md5 = this.md5.EncoderByMd5(loginpassword);
            user.setLoginpassword(md5);
            userMapper.addUser(user);

        }else{
            throw new RuntimeException("两次密码输入错误");
        }






    }

    @Override
    public User findByPhone(String phone) {
        return userMapper.selectByPhone(phone);
    }

}




