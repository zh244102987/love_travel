package com.qfedu.love_travel.vo;

import com.qfedu.love_travel.entity.Hoteldetail;
import lombok.Data;

import java.util.List;

@Data
public class VHotelInfo {

    /**
     * 酒店详情信息
     */
    private Hoteldetail hoteldetail;
    /**
     * 酒店配套设施信息
     */
    private List<VHotelsupporting> supportingList;
}
