package com.qfedu.love_travel.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qfedu.love_travel.dao.HotelcommentMapper;
import com.qfedu.love_travel.entity.Hotelcomment;
import com.qfedu.love_travel.service.HotelcommentService;
import com.qfedu.love_travel.vo.VHotelComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 酒店评论 服务实现类
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
@Service
public class HotelcommentServiceImpl extends ServiceImpl<HotelcommentMapper, Hotelcomment> implements HotelcommentService {

    @Autowired(required = false)
    private HotelcommentMapper hotelcommentMapper;

    @Override
    public Page<VHotelComment> findAllCommentByDetailId(Integer currentPage, Integer size, Integer detailId) {
        Page<VHotelComment> page = new Page<>(currentPage, size);

        return page.setRecords(hotelcommentMapper.selectAllCommentByDetailId(page, detailId));
    }
}
