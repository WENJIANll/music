package com.hellomusic.music.service.impl;


import com.hellomusic.music.dao.BlogTypeMapper;
import com.hellomusic.music.domain.BlogType;
import com.hellomusic.music.service.BlogTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogTypeServiceImpl implements BlogTypeService {

    @Autowired
    private BlogTypeMapper blogTypeMapper;

    /**
     * 添加博客类型
     *
     * @param blogType
     */
    @Override
    public boolean addBlogType(BlogType blogType) {
        return blogTypeMapper.addBlogType(blogType) > 0;
    }

    /**
     * 查询所有博客类型
     */
    @Override
    public List<BlogType> selectAllBlogType() {
        return blogTypeMapper.selectAllBlogType();
    }
}
