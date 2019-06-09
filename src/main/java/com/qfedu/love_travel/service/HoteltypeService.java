package com.qfedu.love_travel.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.qfedu.love_travel.entity.Hoteltype;
import com.qfedu.love_travel.vo.VHotelMenuInfo;

import java.util.List;

/**
 * <p>
 * 酒店分类 服务类
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
public interface HoteltypeService extends IService<Hoteltype> {

    List<VHotelMenuInfo> findMenuByTheme();

    List<VHotelMenuInfo> findMenuBySale();
}
