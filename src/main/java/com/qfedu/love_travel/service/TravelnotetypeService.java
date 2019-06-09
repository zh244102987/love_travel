package com.qfedu.love_travel.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.qfedu.love_travel.entity.Travelnotetype;
import com.qfedu.love_travel.vo.VTravelNoteTypeInfo;

import java.util.List;

/**
 * <p>
 * 游记分类 服务类
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
public interface TravelnotetypeService extends IService<Travelnotetype> {

    /**
     * 根据父分类查询所有子分类
     * @param id
     * @return
     */
    public List<VTravelNoteTypeInfo> findById(Integer id);

    /**
     * 查询所有分类信息
     * @return
     */
    public List<VTravelNoteTypeInfo> findAllTypeInfo();

}
