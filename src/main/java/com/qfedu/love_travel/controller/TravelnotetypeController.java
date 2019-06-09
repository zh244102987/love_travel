package com.qfedu.love_travel.controller;


import com.qfedu.love_travel.service.TravelnotetypeService;
import com.qfedu.love_travel.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 游记分类 前端控制器
 * </p>
 *
 * @author 段继亮
 * @since 2019-06-08
 */
@Controller
@RequestMapping("/travelnotetype")
@ResponseBody
@Api(value = "查询攻略类型的接口",tags = "查询攻略分类的数据接口")
public class TravelnotetypeController {

    @Autowired(required = false)
    private TravelnotetypeService travelnotetypeService;

    @GetMapping("/findAll.do")
    @ApiOperation(value = "查询一级和二级分类信息")
    public R findAllTypeInfo() {
        return R.setOK("OK", travelnotetypeService.findAllTypeInfo());
    }

    @GetMapping("/findById.do")
    @ApiOperation(value = "根据一级分类id查询子分类信息")
    public R findTypeById(Integer id) {
        return R.setOK("OK", travelnotetypeService.findById(id));
    }
}

