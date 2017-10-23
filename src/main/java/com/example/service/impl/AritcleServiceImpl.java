package com.example.service.impl;

import com.example.dao.ArticleDao;
import com.example.model.Article;
import com.example.service.AritcleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wangyonghua on 2017/10/23.
 */
@Service
public class AritcleServiceImpl implements AritcleService {

    @Autowired
    private ArticleDao articleDao;

    public void save(Article t) {
        articleDao.save(t);
    }
}
