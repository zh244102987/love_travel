package com.qfedu.love_travel.service.impl;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qfedu.love_travel.dao.TravelnoteMapper;
import com.qfedu.love_travel.entity.Travelnote;
import com.qfedu.love_travel.service.TravelnoteService;
import com.qfedu.love_travel.vo.VTravelNote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * 游记 服务实现类
 * </p>
 *
 * @author hai123
 * @since 2019-06-06
 */
@Service
public class TravelnoteServiceImpl extends ServiceImpl<TravelnoteMapper, Travelnote> implements TravelnoteService {

    @Autowired(required = false)
    private TravelnoteMapper travelnoteMapper;

    @Transactional(readOnly = true)
    @Override
    public Page<VTravelNote> findByPage(Integer currentPage, Integer size) {
        Page<VTravelNote> page = new Page<>(currentPage, size);
        return page.setRecords(travelnoteMapper.selectAll(page));
    }

    @Override
    public List<Travelnote> findTopFive() {
        return travelnoteMapper.selectTopFive();
    }
}
