package com.qfedu.love_travel.vo;

import lombok.Data;

@Data
public class VTravelNoteType {

    private Integer id;
    private String name;
    /**
     * 子级分类的总数量
     */
    private Integer ccount;
}
