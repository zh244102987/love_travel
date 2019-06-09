package com.qfedu.love_travel.controller;


import com.qfedu.love_travel.service.TravelnoteinfoService;
import com.qfedu.love_travel.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 游记详情 前端控制器
 * </p>
 *
 * @author 段继亮
 * @since 2019-06-09
 */
@Api(value = "查询游记详情的接口", tags = "查询游记详情的数据接口")
@Controller
@RequestMapping("/travelnoteinfo")
@ResponseBody
public class TravelnoteinfoController {

    @Autowired(required = false)
    private TravelnoteinfoService travelnoteinfoService;

    @GetMapping("/findById.do")
    @ApiOperation(value = "查询单条游记详情")
    public R findById(Integer id) {
        return R.setOK("OK", travelnoteinfoService.findById(id));
    }
}

