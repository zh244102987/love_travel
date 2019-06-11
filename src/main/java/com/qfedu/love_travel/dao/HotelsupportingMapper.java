package com.qfedu.love_travel.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qfedu.love_travel.entity.Hotelsupporting;
import com.qfedu.love_travel.vo.VHotelsupporting;

import java.util.List;

/**
 * <p>
 * 酒店配套 Mapper 接口
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
public interface HotelsupportingMapper extends BaseMapper<Hotelsupporting> {

    List<VHotelsupporting> selectByInfoid(Integer infoId);
}
