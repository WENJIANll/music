package com.hellomusic.music.dao;


import com.hellomusic.music.domain.BlogType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogTypeMapper {
    /* 添加博客类型 */
    public int addBlogType(BlogType blogType);

    /* 查询博客类型 */
    public List<BlogType> selectAllBlogType();
}
