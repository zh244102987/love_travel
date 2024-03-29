package com.qfedu.love_travel.controller;


import com.qfedu.love_travel.service.TravelnoteService;
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
 * 游记 前端控制器
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
@Controller
@RequestMapping("/travelnote")
@ResponseBody
@Api(value = "查询游记信息的接口", tags = "查询游记信息的数据接口")
public class TravelnoteController {

    @Autowired(required = false)
    private TravelnoteService travelnoteService;

    @GetMapping("/findByPage.do")
    @ApiOperation(value = "分页查询游记信息")
    public R findAll(Integer currentPage, Integer size) {
        return R.setOK("OK", travelnoteService.findByPage(currentPage, size));
    }

    @GetMapping("/findTopFive.do")
    @ApiOperation(value = "查询评论前五的游记图片和区域信息")
    public R findTopFive() {
        return R.setOK("OK", travelnoteService.findTopFive());
    }

    @GetMapping("/findTopTen.do")
    @ApiOperation(value = "查询点赞数前十的游记城市")
    public R findTopTen() {
        return R.setOK("OK", travelnoteService.findTopTen());
    }

    @GetMapping("/findOverseasTopTen.do")
    @ApiOperation(value = "查询国外游记浏览数前十的游记信息")
    public R findOverseasTopTen() {
        return R.setOK("OK", travelnoteService.findOverseasTopTen());
    }

    @GetMapping("/findDomesticTopTen.do")
    @ApiOperation(value = "查询国内游记浏览数前十的游记信息")
    public R findDomesticTopTen() {
        return R.setOK("OK", travelnoteService.findDomesticTopTen());
    }

    @GetMapping("/findSubjectTopTen.do")
    @ApiOperation(value = "查询主题游记浏览数前十的游记信息")
    public R findSubjectTopTen() {
        return R.setOK("OK", travelnoteService.findSubjectTopTen());
    }
}

