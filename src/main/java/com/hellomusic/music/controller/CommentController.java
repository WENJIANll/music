package com.hellomusic.music.controller;

import com.alibaba.fastjson.JSONObject;
import com.hellomusic.music.domain.Comment;
import com.hellomusic.music.service.CommentService;
import com.hellomusic.music.utils.Consts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    /**
     * 添加评论
     * */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Object addCom(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        String objectId = request.getParameter("songListId");
        String userId = request.getParameter("userId");
        String content = request.getParameter("content");
        String contentId = "";
        if (objectId != null){
            contentId = "songList";
        }else {
            jsonObject.put(Consts.CODE,0);
            jsonObject.put(Consts.MSG,"评价失败");
            return jsonObject;
        }
        Comment comment = new Comment();
        comment.setContentId(contentId);
        comment.setObjectId(Integer.valueOf(objectId));
        comment.setUserId(Integer.valueOf(userId));
        comment.setContent(content);
        boolean flag = commentService.insert(comment);
        if(flag){
            jsonObject.put(Consts.CODE,1);
            jsonObject.put(Consts.MSG,"评论成功");
            return jsonObject;
        }
        jsonObject.put(Consts.CODE,0);
        jsonObject.put(Consts.MSG,"评论成功");
        return jsonObject;
    }


    /**
     * 添加评论
     * */
    @RequestMapping(value = "/commentOfSongListId",method = RequestMethod.GET)
    public Object selectComOfObject(HttpServletRequest request){
        String objectId = request.getParameter("songListId");
        String contentId = "";
        if (objectId != null){
            contentId = "songList";
        }
        return commentService.selectComByUID(contentId, Integer.valueOf(objectId));
    }
}
