package com.qfedu.love_travel.controller;


import com.qfedu.love_travel.service.TravelnotecommentService;
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
 * 游记评论 前端控制器
 * </p>
 *
 * @author 段继亮
 * @since 2019-06-09
 */
@Controller
@RequestMapping("/travelnotecomment")
@ResponseBody
@Api(value = "查询游记评论的接口", tags = "查询游记评论的数据接口")
public class TravelnotecommentController {

    @Autowired(required = false)
    private TravelnotecommentService travelnotecommentService;

    @GetMapping("/findCommentByNoteId.do")
    @ApiOperation(value = "根据游记id查询分页查询相关评论")
    public R findAllCommentByNoteId(Integer currentPage, Integer size, Integer noteId) {
        // 每页显示数据设置为50条
        size = 50;
        return R.setOK("OK", travelnotecommentService.findAllCommentByNoteId(currentPage, size, noteId));
    }
}

