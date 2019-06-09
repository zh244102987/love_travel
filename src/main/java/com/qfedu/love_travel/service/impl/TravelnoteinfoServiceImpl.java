package com.qfedu.love_travel.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qfedu.love_travel.dao.TravelnoteinfoMapper;
import com.qfedu.love_travel.entity.Travelnoteinfo;
import com.qfedu.love_travel.service.TravelnoteinfoService;
import com.qfedu.love_travel.vo.VTravelNoteInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 游记详情 服务实现类
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
@Service
public class TravelnoteinfoServiceImpl extends ServiceImpl<TravelnoteinfoMapper, Travelnoteinfo> implements TravelnoteinfoService {

    @Autowired(required = false)
    private TravelnoteinfoMapper travelnoteinfoMapper;

    @Override
    public VTravelNoteInfo findById(Integer id) {
        return travelnoteinfoMapper.selectOneById(id);
    }
}
