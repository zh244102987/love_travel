package com.qfedu.love_travel.controller;


import com.qfedu.love_travel.entity.User;
import com.qfedu.love_travel.service.UserService;
import com.qfedu.love_travel.util.MD5;
import com.qfedu.love_travel.util.PhoneCode;
import com.qfedu.love_travel.util.StaticPeram;
import com.qfedu.love_travel.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

@Api(value = "操作用户的增删改查以及登陆",tags = "操作用户")
@RestController
@RequestMapping("/user")
public class UserConteoller {

    @Autowired(required = false)
    UserService userService;


   // PhoneCode phoneCode = new PhoneCode();


    @ApiOperation(value = "查询所有用户")
    @GetMapping ("/all.do")
        public R findAll(){

            return R.setOK("OK",userService.list());
        }


        @ApiOperation(value = "登陆接口")
        @GetMapping("/login.do")
        @CrossOrigin
        public R login(String phone, String loginpassword) throws UnsupportedEncodingException, NoSuchAlgorithmException {

                User login = userService.Login(phone,loginpassword);

            return R.setOK("OK",login);

        }

    @ApiOperation(value = "根据用户Id查询")
    @GetMapping("/query.do")
    @CrossOrigin
    public R queryById(int id){
        return R.setOK("OK", userService.getById(id));
    }


    @ApiOperation(value = "新增用户",notes = "新增用户")
    @PostMapping("/save.do")
    @CrossOrigin
    public R AddUser(User user,String code,String loginpassword1) throws UnsupportedEncodingException, NoSuchAlgorithmException {




            userService.addUser(user,code,loginpassword1);
        return R.setOK("OK",null);

    }
 /*   @ApiOperation(value = "上传图片",notes = "上传图片")
    @ResponseBody
    @RequestMapping(path = "/save_photo", method={RequestMethod.POST})
    public void addDish(@RequestParam("photos") MultipartFile file,User user, HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        String path = null;// 文件路径
        String json = "";
        if (file!=null) {// 判断上传的文件是否为空

            String type = null;// 文件类型
            String fileName = file.getOriginalFilename();// 文件原名称
            System.out.println("上传的文件原名称:"+fileName);
            // 判断文件类型
            type = fileName.indexOf(".")!=-1?fileName.substring(fileName.lastIndexOf(".")+1, fileName.length()):null;
            if (type!=null) {// 判断文件类型是否为空
                if ("GIF".equals(type.toUpperCase())||"PNG".equals(type.toUpperCase())||"JPG".equals(type.toUpperCase())) {
                    // 项目在容器中实际发布运行的根路径
                    String realPath = request.getSession().getServletContext().getRealPath("/");
                    // 自定义的文件名称
                    String trueFileName = String.valueOf(System.currentTimeMillis()) + "." + type;
                    // 设置存放图片文件的路径
                    path = realPath+*//*System.getProperty("file.separator")+*//*trueFileName;
                    System.out.println("存放图片文件的路径:"+path);
                    // 转存文件到指定的路径
                    file.transferTo(new File(path));
                    user.setHeadimgurl("/image/" + path);
                    userService.addUser(user);
                    System.out.println("文件成功上传到指定目录下");

                }
                json = "{\"res\":1}";
            }else {
                System.out.println("不是我们想要的文件类型,请按要求重新上传");
                //return null;
                json = "{\"res\":0}";
            }
        }else {
            System.out.println("文件类型为空");
            //return null;
            json = "{\"res\":0}";
        }
    }*/



    @ApiOperation(value = "短信接口测试",notes = "注册用户")
    @PostMapping("/code.do")
    @CrossOrigin
    public R code(String phone,HttpSession session){


         PhoneCode.getPhonemsg(phone);
        String vcode = PhoneCode.vcode();
        String code = PhoneCode.code;
        System.out.println("code="+code);
        session.setAttribute("code",code);
        System.out.println("验证码获取到了吗？"+vcode);
        //System.out.println(code1);

        return R.setOK("OK",code);
    }



}
