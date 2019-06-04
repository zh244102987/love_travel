package com.qfedu.boot_ssm1901.service;

import com.qfedu.boot_ssm1901.entity.News;
import com.qfedu.boot_ssm1901.vo.R;

/**
 *@Author feri
 *@Date Created in 2019/6/3 11:45
 */
public interface NewsService {
    R save(News news);
    R queryAll();
}
