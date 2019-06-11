package com.qfedu.love_travel.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qfedu.love_travel.service.DestinationService;
import com.qfedu.love_travel.service.HoteltypeService;
import com.qfedu.love_travel.vo.R;
import com.qfedu.love_travel.vo.VHotelMenuInfo;
import com.qfedu.love_travel.vo.VHotelTypeDest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 酒店分类 前端控制器
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
@Api(value = "按分类展示酒店", tags = "查询酒店分类菜单的数据接口")
@RestController
@RequestMapping("/hotel")
public class HoteltypeController {

    @Autowired
    private HoteltypeService hoteltypeService;

    @Autowired
    private DestinationService destinationService;

    @ApiOperation("查询主题酒店的所有子菜单")
    @GetMapping("/theme.do")
    public R getMenuByTheme(){

        List<VHotelMenuInfo> themeMenu = hoteltypeService.findMenuByTheme();
        return R.setOK(null, themeMenu);
    }

    @ApiOperation("查询特价酒店的所有子菜单")
    @GetMapping("/sale.do")
    public R getMenuBySale(){

        List<VHotelMenuInfo> saleDestList = hoteltypeService.findMenuBySale();
        return R.setOK(null, saleDestList);
    }

    @ApiOperation("'订酒店'页面的模糊查询")
    @GetMapping("/search.do")
    public R searchByName(String name, Integer currentPage, Integer size){

        Page<VHotelTypeDest> destList = destinationService.findByCondition(name, currentPage, size);
        return R.setOK(null, destList);
    }
}

