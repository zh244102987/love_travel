package com.qfedu.love_travel.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.qfedu.love_travel.entity.Hoteldetail;
import com.qfedu.love_travel.vo.VHotelInfo;

/**
 * <p>
 * 酒店详情 服务类
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
public interface HoteldetailService extends IService<Hoteldetail> {

    VHotelInfo findAllInfoByHotelId(Integer hotelId);
}
