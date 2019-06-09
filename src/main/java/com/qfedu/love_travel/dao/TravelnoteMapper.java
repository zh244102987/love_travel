package com.qfedu.love_travel.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qfedu.love_travel.entity.Travelnote;
import com.qfedu.love_travel.vo.VTravelNote;

import java.util.List;

/**
 * <p>
 * 游记 Mapper 接口
 * </p>
 *
 * @author 段继亮
 * @since 2019-06-09
 */
public interface TravelnoteMapper extends BaseMapper<Travelnote> {

    /**
     * 分页查询游记信息
     * @param page Page对象
     * @return
     */
    public List<VTravelNote> selectAll(Page page);

    /**
     * 查询浏览数前五的游记信息
     * @return
     */
    public List<Travelnote> selectTopFive();

    /**
     * 查询点赞数前前十的游记城市
     * @return
     */
    public List<Travelnote> selectTopTen();
}
