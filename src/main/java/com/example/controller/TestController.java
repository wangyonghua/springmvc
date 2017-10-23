package com.example.controller;

import com.example.model.Article;
import com.example.service.AritcleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangyonghua on 2017/10/18.
 */
@RestController
public class TestController {
    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private AritcleService aritcleService;

    //映射一个action
    @RequestMapping("/test")
    public String index() {
        Article article = new Article();
        article.setId(2);
        article.setName("测试");
        aritcleService.save(article);
        return "ok";
    }
}
