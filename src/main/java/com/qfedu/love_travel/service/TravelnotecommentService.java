package com.qfedu.love_travel.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.qfedu.love_travel.entity.Travelnotecomment;

/**
 * <p>
 * 游记评论 服务类
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
public interface TravelnotecommentService extends IService<Travelnotecomment> {

    /**
     * 根据游记id分页查询该游记相关的所有评论
     * @param currentPage 当前需要查询的第几页
     * @param size 每页显示的数据条数
     * @param noteId 游记编号
     * @return
     */
    public Page<Travelnotecomment> findAllCommentByNoteId(Integer currentPage, Integer size, Integer noteId);

}
