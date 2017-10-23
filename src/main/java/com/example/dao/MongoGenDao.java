package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

/**
 * description:
 *
 * @author <a href='mailto:dennisit@163.com'> Cn.苏若年 (En.dennisit)</a> Copy Right since 2013-10-13
 *         <p>
 *         com.pudp.base.MongoGenDao.java
 */

public abstract class MongoGenDao<T> {

    @Autowired
    protected MongoTemplate mongoTemplate;


    /**
     * 保存一个对象
     *
     * @param t
     * @return
     * @author <a href='mailto:dennisit@163.com'>Cn.苏若年(En.dennisit)</a> Copy Right since 2013-10-13 下午03:37:28
     */
    public void save(T t) {
        this.mongoTemplate.save(t);
    }

    /**
     * 根据Id从Collection中查询对象
     *
     * @param id 实体对象的Id,对应Collection中记录的_id字段.
     *           <p>
     *           需要说明的是,Mongdo自身没有主键自增机制.解决方法
     *           <ol>
     *           <li>实体入库的时候,程序中为实体赋主键值.
     *           <li>实体入库的时候,在mongodb中自定义函数实现主键自增机制.定义方法同js代码类似
     *           </ol>
     *           </p>
     * @return
     * @author <a href='mailto:dennisit@163.com'>Cn.苏若年(En.dennisit)</a> Copy Right since 2013-10-17 下午01:59:55
     */
    public T queryById(String id) {
        Query query = new Query();
        Criteria criteria = Criteria.where("_id").is(id);
        query.addCriteria(criteria);
        return this.mongoTemplate.findOne(query, this.getEntityClass());
    }


    protected abstract Class<T> getEntityClass();

}