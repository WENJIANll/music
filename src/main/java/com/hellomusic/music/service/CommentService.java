package com.hellomusic.music.service;

import com.hellomusic.music.domain.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentService {

    /**
     * 为指定对象增加添加评论记录
     * */
    public boolean insert(Comment comment);

    /**
     * 获取指定对象的评论
     * */
    public List<Comment> selectComByUID(String contentId,Integer objectId);
}
