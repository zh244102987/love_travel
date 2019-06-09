package com.qfedu.love_travel.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.qfedu.love_travel.entity.Travelnote;
import com.qfedu.love_travel.vo.VTravelNote;

/**
 * <p>
 * 游记 服务类
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
public interface TravelnoteService extends IService<Travelnote> {

    /**
     * 分页查询游记信息
     * @param currentPage 要查询的当前页
     * @param size 每页显示的数据条数
     * @return
     */
    public Page<VTravelNote> findByPage(Integer currentPage, Integer size);

}
