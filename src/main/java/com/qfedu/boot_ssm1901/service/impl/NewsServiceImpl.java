package com.qfedu.boot_ssm1901.service.impl;

import com.qfedu.boot_ssm1901.dao.NewsDao;
import com.qfedu.boot_ssm1901.entity.News;
import com.qfedu.boot_ssm1901.service.NewsService;
import com.qfedu.boot_ssm1901.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *@Author feri
 *@Date Created in 2019/6/3 11:51
 */
@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsDao newsDao;

    @Override
    public R save(News news) {
        if(newsDao.insert(news)>0){
            return R.setOK();
        }else {
            return R.setERROR();
        }
    }

    @Override
    public R queryAll() {
        return R.setOK("OK",newsDao.queryAll());
    }
}
