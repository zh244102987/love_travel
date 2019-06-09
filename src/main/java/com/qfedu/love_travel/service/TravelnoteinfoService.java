package com.qfedu.love_travel.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.qfedu.love_travel.entity.Travelnoteinfo;
import com.qfedu.love_travel.vo.VTravelNoteInfo;

/**
 * <p>
 * 游记详情 服务类
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
public interface TravelnoteinfoService extends IService<Travelnoteinfo> {

    /**
     * 根据id查询游记详情
     * @param id 游记id
     * @return
     */
    public VTravelNoteInfo findById(Integer id);
}
