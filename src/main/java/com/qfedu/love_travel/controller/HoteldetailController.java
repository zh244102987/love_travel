package com.qfedu.love_travel.controller;


import com.qfedu.love_travel.service.HoteldetailService;
import com.qfedu.love_travel.vo.R;
import com.qfedu.love_travel.vo.VHotelInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 酒店详情 前端控制器
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
@RestController
@RequestMapping("/hoteldetail")
@Api(value = "查询酒店详情的接口", tags = "查询酒店详情的数据接口")
public class HoteldetailController {

    @Autowired
    private HoteldetailService hoteldetailService;

    @GetMapping("/detail.do")
    @ApiOperation(value = "根据酒店详情id查询酒店详情以及酒店配套设施")
    public R getHotelDetailByHotelId(Integer hotelId){
       VHotelInfo hotelInfo = hoteldetailService.findAllInfoByHotelId(hotelId);

       return R.setOK(null, hotelInfo);
    }
}

