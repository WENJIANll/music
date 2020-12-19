package com.hellomusic.music.service.impl;


import com.hellomusic.music.dao.CommentMapper;
import com.hellomusic.music.domain.Comment;
import com.hellomusic.music.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    /**
     * 为指定对象增加添加评论记录
     *
     * @param comment
     */
    @Override
    public boolean insert(Comment comment) {
        return commentMapper.insert(comment) > 0;
    }

    /**
     * 获取指定对象的评论
     *
     * @param contentId
     * @param objectId
     */
    @Override
    public List<Comment> selectComByUID(String contentId, Integer objectId) {
        return commentMapper.selectComByUID(contentId,objectId);
    }
}
