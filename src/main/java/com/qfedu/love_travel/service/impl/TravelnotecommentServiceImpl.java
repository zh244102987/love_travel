package com.qfedu.love_travel.service.impl;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qfedu.love_travel.dao.TravelnotecommentMapper;
import com.qfedu.love_travel.entity.Travelnotecomment;
import com.qfedu.love_travel.service.TravelnotecommentService;
import com.qfedu.love_travel.vo.VTravelNoteComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 游记评论 服务实现类
 * </p>
 *
 * @author 段继亮
 * @since 2019-06-09
 */
@Service
public class TravelnotecommentServiceImpl extends ServiceImpl<TravelnotecommentMapper, Travelnotecomment> implements TravelnotecommentService {

    @Autowired(required = false)
    private TravelnotecommentMapper travelnotecommentMapper;

    @Transactional(readOnly = true)
    @Override
    public Page<VTravelNoteComment> findAllCommentByNoteId(Integer currentPage, Integer size, Integer noteId) {
        Page<VTravelNoteComment> page = new Page<>(currentPage, size);
        return page.setRecords(travelnotecommentMapper.selectAllCommentByNoteId(page, noteId));
    }
}
