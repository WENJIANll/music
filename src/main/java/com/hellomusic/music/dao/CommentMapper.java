package com.hellomusic.music.dao;


import com.hellomusic.music.domain.Comment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentMapper {

    /* 为指定对象增加添加评论记录 */
    public int insert(Comment comment);

    /* 获取指定对象的评论 */
    public List<Comment> selectComByUID(@Param("contentId") String contentId, @Param("objectId") Integer objectId);
}
