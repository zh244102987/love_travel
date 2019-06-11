package com.qfedu.love_travel.service.impl;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qfedu.love_travel.dao.DestinationMapper;
import com.qfedu.love_travel.entity.Destination;
import com.qfedu.love_travel.service.DestinationService;
import com.qfedu.love_travel.vo.VHotelTypeDest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 目的地 服务实现类
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
@Service
public class DestinationServiceImpl extends ServiceImpl<DestinationMapper, Destination> implements DestinationService {

    @Autowired(required = false)
    private DestinationMapper destinationMapper;

    @Override
    public Page<VHotelTypeDest> findByCondition(String name, Integer currentPage, Integer size) {

        Page<VHotelTypeDest> page = new Page<>(currentPage, size);
        return page.setRecords(destinationMapper.findByName(page, name));
    }
}
