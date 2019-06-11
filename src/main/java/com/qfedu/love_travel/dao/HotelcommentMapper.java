package com.qfedu.love_travel.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qfedu.love_travel.entity.Hotelcomment;
import com.qfedu.love_travel.vo.VHotelComment;

import java.util.List;

/**
 * <p>
 * 酒店评论 Mapper 接口
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
public interface HotelcommentMapper extends BaseMapper<Hotelcomment> {

    List<VHotelComment> selectAllCommentByDetailId(Page page, Integer detailId);
}
