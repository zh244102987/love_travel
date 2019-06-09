package com.qfedu.love_travel.vo;

import lombok.Data;

import java.util.List;

/**
 * 酒店分类菜单，用于提供酒店页面展示的分类信息
 */
@Data
public class VHotelMenuInfo<T> {

    private Integer tid;
    private String name;
    /**
     * 根据需求，元素可能为酒店或者目的地（酒店 or Destination）
     */
    private List<T> list;

}
