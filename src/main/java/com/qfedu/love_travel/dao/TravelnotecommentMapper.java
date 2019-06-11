package com.qfedu.love_travel.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qfedu.love_travel.entity.Travelnotecomment;
import com.qfedu.love_travel.vo.VTravelNoteComment;

import java.util.List;

/**
 * <p>
 * 游记评论 Mapper 接口
 * </p>
 *
 * @author 段继亮
 * @since 2019-06-09
 */
public interface TravelnotecommentMapper extends BaseMapper<Travelnotecomment> {

    /**
     * 根据游记id分页查询该游记相关的所有评论
     * @param page 分页对象
     * @param noteId 游记id
     * @return
     */
    public List<VTravelNoteComment> selectAllCommentByNoteId(Page page, Integer noteId);
}
