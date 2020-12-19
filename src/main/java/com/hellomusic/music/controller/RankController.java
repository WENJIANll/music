package com.hellomusic.music.controller;


import com.alibaba.fastjson.JSONObject;
import com.hellomusic.music.domain.Rank;
import com.hellomusic.music.service.RankService;
import com.hellomusic.music.utils.Consts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 评价控制类
 * */
@RestController
public class RankController {

    @Autowired
    private RankService rankService;

    /**
     * 添加评价
     * */
    @RequestMapping(value = "/rank/add",method = RequestMethod.POST)
    public Object addRank(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        String contentId = "";
        String objectId = request.getParameter("songListId");
        if (objectId != null){
            contentId = "songList";
        }else {
            jsonObject.put(Consts.CODE,0);
            jsonObject.put(Consts.MSG,"评价失败");
            return jsonObject;
        }
        String consumerId = request.getParameter("consumerId");
        String score = request.getParameter("score");

        Rank rank = new Rank();
        rank.setContentId(contentId);
        rank.setObjectId(Integer.valueOf(objectId));
        rank.setConsumerId(Integer.valueOf(consumerId));
        rank.setScore(Integer.valueOf(score));
        boolean flag =  rankService.insert(rank);
        if(flag){
            jsonObject.put(Consts.CODE,1);
            jsonObject.put(Consts.MSG,"评价成功");
            return jsonObject;
        }
        jsonObject.put(Consts.CODE,0);
        jsonObject.put(Consts.MSG,"评价失败");
        return jsonObject;
    }


    /**
     * 计算平均分
     */
    @RequestMapping(value = "/rank",method = RequestMethod.GET)
    public Object rankOfSongListId(HttpServletRequest request){
        String objectId = request.getParameter("songListId");
        String contentId = "";
        if(objectId != null){
            contentId = "songList";
        }
        return rankService.caculScore(rankService.scoreSum(contentId, Integer.valueOf(objectId)),rankService.sume(contentId, Integer.valueOf(objectId)));
    }
}
