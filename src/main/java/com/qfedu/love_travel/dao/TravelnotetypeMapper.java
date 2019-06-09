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
 * @author 段继亮
 * @since 2019-06-08
 */
public interface TravelnotetypeMapper extends BaseMapper<Travelnotetype> {

    /**
     * 根据一级分类id查询所有子分类
     * @param id
     * @return
     */
    public List<VTravelNoteTypeInfo> selectById(Integer id);

    /**
     * 查询所有分类信息
     * @return
     */
    public List<VTravelNoteTypeInfo> selectAllTypeInfo();

}
