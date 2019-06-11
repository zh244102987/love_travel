package com.qfedu.love_travel.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qfedu.love_travel.dao.HoteldetailMapper;
import com.qfedu.love_travel.dao.HotelsupportingMapper;
import com.qfedu.love_travel.entity.Hoteldetail;
import com.qfedu.love_travel.service.HoteldetailService;
import com.qfedu.love_travel.vo.VHotelInfo;
import com.qfedu.love_travel.vo.VHotelsupporting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 酒店详情 服务实现类
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
@Service
public class HoteldetailServiceImpl extends ServiceImpl<HoteldetailMapper, Hoteldetail> implements HoteldetailService {

    @Autowired(required = false)
    private HoteldetailMapper hoteldetailMapper;

    @Autowired(required = false)
    private HotelsupportingMapper hotelsupportingMapper;

    @Override
    public VHotelInfo findAllInfoByHotelId(Integer hotelId) {

        VHotelInfo hotelInfo = new VHotelInfo();

        Map<String, Object> columnMap = new HashMap<>();
        columnMap.put("hotelid", hotelId);
        List<Hoteldetail> hoteldetails = hoteldetailMapper.selectByMap(columnMap);

        hotelInfo.setHoteldetail(hoteldetails.get(0));

        Integer infoId = hotelInfo.getHoteldetail().getId();
        List<VHotelsupporting> supportingList = hotelsupportingMapper.selectByInfoid(infoId);

        hotelInfo.setSupportingList(supportingList);

        return hotelInfo;
    }
}
