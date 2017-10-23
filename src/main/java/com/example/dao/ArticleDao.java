package com.example.dao;

import com.example.model.Article;
import org.springframework.stereotype.Repository;


/**
 * description:
 *
 * @author <a href='mailto:dennisit@163.com'> Cn.苏若年 (En.dennisit)</a> Copy Right since 2013-10-16
 *         <p>
 *         com.pudp.dao.ArticleDao.java
 */

@Repository
public class ArticleDao extends MongoGenDao<Article> {
    @Override
    protected Class<Article> getEntityClass() {
        return Article.class;
    }

    /**
     * 实现钩子方法,返回反射的类型
     * @author <a href='mailto:dennisit@163.com'>Cn.苏若年(En.dennisit)</a> Copy Right since 2013-10-13 
     *
     * @return
     */
}