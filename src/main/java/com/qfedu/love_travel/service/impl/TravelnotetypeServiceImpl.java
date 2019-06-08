package com.qfedu.love_travel.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qfedu.love_travel.dao.TravelnotetypeMapper;
import com.qfedu.love_travel.entity.Travelnotetype;
import com.qfedu.love_travel.service.TravelnotetypeService;
import com.qfedu.love_travel.vo.VTravelNoteTypeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 游记分类 服务实现类
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
@Service
public class TravelnotetypeServiceImpl extends ServiceImpl<TravelnotetypeMapper, Travelnotetype> implements TravelnotetypeService {

    @Autowired(required = false)
    private TravelnotetypeMapper travelnotetypeMapper;

    @Override
    public List<VTravelNoteTypeInfo> findByPid(Integer pid) {
        return travelnotetypeMapper.selectByPid(pid);
    }

    @Override
    public List<VTravelNoteTypeInfo> findAllTypeInfo() {
        return travelnotetypeMapper.selectAllTypeInfo();
    }
}
