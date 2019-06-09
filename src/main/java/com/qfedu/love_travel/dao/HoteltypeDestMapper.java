package com.qfedu.love_travel.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qfedu.love_travel.entity.Destination;
import com.qfedu.love_travel.entity.HoteltypeDest;
import com.qfedu.love_travel.vo.VHotelTypeDest;

import java.util.List;

/**
 * <p>
 * 酒店分类-目的地中间表 Mapper 接口
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
public interface HoteltypeDestMapper extends BaseMapper<HoteltypeDest> {

    List<VHotelTypeDest> selectVDestByTid(Integer id);

    List<Destination> selectDestByTid(Integer id);
}
