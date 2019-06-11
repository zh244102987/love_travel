package com.qfedu.love_travel.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qfedu.love_travel.entity.Destination;
import com.qfedu.love_travel.vo.VHotelTypeDest;

import java.util.List;

/**
 * <p>
 * 目的地 Mapper 接口
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
public interface DestinationMapper extends BaseMapper<Destination> {

    List<VHotelTypeDest> findByName(Page page, String name);
}
