package com.hellomusic.music.domain;


import java.io.Serializable;
import java.util.Date;

/**
 * 评论
 */
public class Comment implements Serializable {
    /*主键*/
    private Integer id;
    /*用户id*/
    private Integer userId;
    /*类型*/
    private String contentId;
    /*object id*/
    private Integer objectId;
    /*评论内容*/
    private String content;
    /*评论时间*/
    private Date createTime;
    /*评论点赞数*/
    private Integer up;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public Integer getObjectId() {
        return objectId;
    }

    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUp() {
        return up;
    }

    public void setUp(Integer up) {
        this.up = up;
    }
}
