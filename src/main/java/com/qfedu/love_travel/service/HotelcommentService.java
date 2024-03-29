package com.qfedu.love_travel.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.qfedu.love_travel.entity.Hotelcomment;
import com.qfedu.love_travel.vo.VHotelComment;

/**
 * <p>
 * 酒店评论 服务类
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
public interface HotelcommentService extends IService<Hotelcomment> {

    Page<VHotelComment> findAllCommentByDetailId(Integer currentPage, Integer size, Integer detailId);
}
