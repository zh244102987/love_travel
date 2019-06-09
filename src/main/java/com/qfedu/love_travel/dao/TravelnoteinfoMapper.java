package com.qfedu.love_travel.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qfedu.love_travel.entity.Travelnoteinfo;
import com.qfedu.love_travel.vo.VTravelNoteInfo;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 游记详情 Mapper 接口
 * </p>
 *
 * @author 段继亮
 * @since 2019-06-09
 */
public interface TravelnoteinfoMapper extends BaseMapper<Travelnoteinfo> {

    /**
     * 根据id查询游记详情
     * @param id 游记id
     * @return
     */
    public VTravelNoteInfo selectOneById(@Param("id") Integer id);
}
