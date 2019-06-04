package com.qfedu.boot_ssm1901.dao;

import com.qfedu.boot_ssm1901.entity.News;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2019/6/3 11:41
 */
public interface NewsDao {
    //新增
    @Insert("insert into news(title,content,ctime) values(#{title},#{content},now())")
    int insert(News news);
    //查询
    @Select("select id,title,content,ctime from news order by ctime desc")
    List<News> queryAll();
}
