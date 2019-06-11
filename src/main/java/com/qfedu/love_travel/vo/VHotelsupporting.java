package com.qfedu.love_travel.vo;

import com.qfedu.love_travel.entity.Hotelsupporting;
import lombok.Data;

import java.util.List;

@Data
public class VHotelsupporting {

    private Integer id;
    /**
     * 酒店配套设施的大类名称
     */
    private String name;
    /**
     * 酒店配套设施的小类列表
     */
    private List<Hotelsupporting> supportingList;
}
