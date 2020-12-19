package com.hellomusic.music.service.impl;

import com.hellomusic.music.dao.RankMapper;
import com.hellomusic.music.domain.Rank;
import com.hellomusic.music.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RankServiceImpl implements RankService {

    @Autowired
    private RankMapper rankMapper;

    @Override
    public boolean insert(Rank rank) {
        return rankMapper.insert(rank) > 0;
    }

    @Override
    public int scoreSum(String contentId, Integer objectId) {
        return rankMapper.scoreSum(contentId, objectId);
    }

    @Override
    public int sume(String contentId, Integer objectId) {
        return rankMapper.sume(contentId, objectId);
    }

    @Override
    public int caculScore(Integer scoreSum, Integer sum) {
        return scoreSum / sum;
    }

}
