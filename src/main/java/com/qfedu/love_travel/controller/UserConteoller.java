package com.qfedu.love_travel.controller;


import com.qfedu.love_travel.entity.User;
import com.qfedu.love_travel.service.UserService;
import com.qfedu.love_travel.util.MD5;
import com.qfedu.love_travel.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

@Api(value = "操作用户的增删改查以及登陆",tags = "操作用户")
@RestController
@RequestMapping("/user")
public class UserConteoller {

    @Autowired(required = false)
    UserService userService;

    private MD5 md5;


    @ApiOperation(value = "查询所有用户")
    @GetMapping ("/all.do")
        public R findAll(){

            return R.setOK("OK",userService.list());
        }


        @ApiOperation(value = "登陆接口")
        @GetMapping("/login.do")
        public R login(String phone,String loginpassword) {
            User login = userService.Login(phone,loginpassword);
            return R.setOK("OK",login);

        }
 /*   @ApiOperation(value = "查询所有用户")
    @GetMapping("/all.do")
    public R queryAll(){
        R ok = R.setOK("OK", userService.list());
        System.out.println(ok);
        return ok;

    }*/
    @ApiOperation(value = "根据用户Id查询")
    @GetMapping("/query.do")
    @CrossOrigin
    public R queryById(int id){
        return R.setOK("OK", userService.getById(id));
    }


    @ApiOperation(value = "新增用户",notes = "新增用户")
    @PostMapping("/save.do")
    @CrossOrigin
    public R AddUser(User user) throws UnsupportedEncodingException, NoSuchAlgorithmException {
            User user1 = new User();
        String loginpassword = user.getLoginpassword();

          //String  password = md5.EncoderByMd5(loginpassword);
        String s = md5.EncoderByMd5(loginpassword);
        //System.out.println("得到加密后的密码了吗+"+s);

        user1.setLoginpassword(s);
        return R.setOK("OK", userService.save(user1));

    }

}
