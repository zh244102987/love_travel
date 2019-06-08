package com.qfedu.love_travel.vo;

import lombok.Data;

import java.util.List;

@Data
public class VTravelNoteTypeInfo {

    private Integer pid;
    private String pName;
    /**
     * 一个父级分类拥有多个子分类
     */
    private List<VTravelNoteType> cType;
}
