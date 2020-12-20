package com.hellomusic.music.service;

import com.hellomusic.music.domain.BlogType;

import java.util.List;

public interface BlogTypeService {

    /**
     * 添加博客类型
     * */
    public boolean addBlogType(BlogType blogType);

    /**
     * 查询所有博客类型
     * */
    public List<BlogType> selectAllBlogType();
}
