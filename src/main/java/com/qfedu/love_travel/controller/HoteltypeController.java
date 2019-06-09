package com.qfedu.love_travel.controller;


import com.qfedu.love_travel.service.HoteltypeService;
import com.qfedu.love_travel.vo.R;
import com.qfedu.love_travel.vo.VHotelMenuInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
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
@Api
@RestController
@RequestMapping("/hotel")
public class HoteltypeController {

    @Autowired
    private HoteltypeService hoteltypeService;

    @ApiOperation("查询主题酒店的所有子菜单")
    @RequestMapping("theme.do")
    public R getMenuByTheme(){

        List<VHotelMenuInfo> themeMenu = hoteltypeService.findMenuByTheme();
        return R.setOK(null, themeMenu);
    }

    @ApiOperation("查询特价酒店的所有子菜单")
    @RequestMapping("sale.do")
    public R getMenuBySale(){

        List<VHotelMenuInfo> saleDestList = hoteltypeService.findMenuBySale();
        return R.setOK(null, saleDestList);
    }
}

