package com.qfedu.love_travel.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.qfedu.love_travel.entity.Destination;
import com.qfedu.love_travel.vo.VHotelTypeDest;

/**
 * <p>
 * 目的地 服务类
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
public interface DestinationService extends IService<Destination> {

    Page<VHotelTypeDest> findByCondition(String name, Integer currentPage, Integer size);
}
