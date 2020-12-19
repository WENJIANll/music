package com.hellomusic.music.service;


import com.hellomusic.music.domain.Rank;
import com.hellomusic.music.domain.Singer;

public interface RankService {
    /* 增加 */
    public boolean insert(Rank rank);

    /* 求总分 */
    public int scoreSum(String contentId, Integer objectId);

    /* 求有多少人评价 */
    public int sume(String contentId, Integer objectId);

    /* 计算平均分 */
    public int caculScore(Integer SumOfScore, Integer sumOfHow);
}
