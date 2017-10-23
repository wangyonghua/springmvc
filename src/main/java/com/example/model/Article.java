package com.example.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * Created by wangyonghua on 2017/10/23.
 */
public class Article implements Serializable {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id

    private Integer id;

    private String name;
}
