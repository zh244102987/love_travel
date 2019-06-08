package com.qfedu.love_travel.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qfedu.love_travel.entity.Travelnotetype;
import com.qfedu.love_travel.vo.VTravelNoteTypeInfo;

import java.util.List;

/**
 * <p>
 * 游记分类 Mapper 接口
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
public interface TravelnotetypeMapper extends BaseMapper<Travelnotetype> {

    /**
     * 根据父分类查询所有子分类
     * @param pid
     * @return
     */
    public List<VTravelNoteTypeInfo> selectByPid(Integer pid);

    /**
     * 查询所有分类信息
     * @return
     */
    public List<VTravelNoteTypeInfo> selectAllTypeInfo();
}
