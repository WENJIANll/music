package com.hellomusic.music.dao;

import com.hellomusic.music.domain.Rank;
import com.hellomusic.music.domain.Singer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RankMapper {
    /* 增加 */
    public int insert(Rank rank);

    /* 求总分 */
    public int scoreSum(@Param("contentId") String contentId, @Param("objectId") Integer objectId);

    /* 求有多少人评价 */
    public int sume(@Param("contentId") String contentId, @Param("objectId") Integer objectId);

    /* 计算平均分 */
    public int caculScore(@Param("scoreSum") Integer scoreSum, @Param("sum") Integer sum);


    /* 查询 */
    /* 根据主键查询 */
    public List<Rank> selectByPId(String contentId,Integer objectId,Integer consumerId);
}

