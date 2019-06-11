package com.qfedu.love_travel.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qfedu.love_travel.dao.HotelMapper;
import com.qfedu.love_travel.dao.HoteltypeDestMapper;
import com.qfedu.love_travel.dao.HoteltypeMapper;
import com.qfedu.love_travel.entity.Destination;
import com.qfedu.love_travel.entity.Hotel;
import com.qfedu.love_travel.entity.Hoteltype;
import com.qfedu.love_travel.service.HoteltypeService;
import com.qfedu.love_travel.vo.VHotelMenuInfo;
import com.qfedu.love_travel.vo.VHotelTypeDest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 酒店分类 服务实现类
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
@Service
public class HoteltypeServiceImpl extends ServiceImpl<HoteltypeMapper, Hoteltype> implements HoteltypeService {

    @Autowired(required = false)
    private HoteltypeMapper hoteltypeMapper;

    @Autowired(required = false)
    private HoteltypeDestMapper hoteltypeDestMapper;

    @Autowired(required = false)
    private HotelMapper hotelMapper;

    @Override
    public List<VHotelMenuInfo> findMenuByTheme() {
        List<VHotelMenuInfo> menulist = new ArrayList<>();

        List<Hoteltype> typeList = hoteltypeMapper.selectAllByPName("主题酒店");

        for (Hoteltype type : typeList) {
            VHotelMenuInfo<VHotelTypeDest> menu = new VHotelMenuInfo<>();
            menu.setName(type.getName());

            List<VHotelTypeDest> dests = hoteltypeDestMapper.selectVDestByTid(type.getId());
            menu.setList(dests);

            menu.setTid(type.getId());

            menulist.add(menu);
        }

        return menulist;
    }

    @Override
    public List<VHotelMenuInfo> findMenuBySale() {

        List<VHotelMenuInfo> menulist = new ArrayList<>();

        Map<String, Object> cloumnMap = new HashMap<>();
        cloumnMap.put("name", "特价酒店");

        List<Hoteltype> types = hoteltypeMapper.selectByMap(cloumnMap);

        List<Destination> dests = hoteltypeDestMapper.selectDestByTid(types.get(0).getId());

        for (Destination dest : dests) {
            VHotelMenuInfo<Hotel> menu = new VHotelMenuInfo<>();

            menu.setName(dest.getName());

            Map<String, Object> map = new HashMap<>();
            map.put("destid", dest.getId());

            List<Hotel> hotels = hotelMapper.selectByMap(map);
            menu.setList(hotels);

            menulist.add(menu);
        }
        return menulist;
    }

}
