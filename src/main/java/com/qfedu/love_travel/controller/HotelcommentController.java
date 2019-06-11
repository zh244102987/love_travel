package com.qfedu.love_travel.controller;


import com.qfedu.love_travel.service.HotelcommentService;
import com.qfedu.love_travel.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 酒店评论 前端控制器
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
@RestController
@RequestMapping("/hotelcomment")
@Api(value = "查询酒店评论的接口", tags = "查询酒店评论的数据接口")
public class HotelcommentController {

    @Autowired(required = false)
    private HotelcommentService hotelcommentService;

    @GetMapping("/findCommentByDetailId.do")
    @ApiOperation(value = "根据酒店详情id查询分页查询相关评论")
    public R findAllCommentByDetailId(Integer currentPage, Integer size, Integer detailId) {
        return R.setOK("OK", hotelcommentService.findAllCommentByDetailId(currentPage, size, detailId));
    }
}

