package com.hellomusic.music.dao;

import com.hellomusic.music.domain.Singer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SingerMapper {

    /* 增加 */
    public int insert(Singer singer);

    /* 修改 */
    public int modify(Singer singer);

    /* 删除 */
    public int delete(Integer id);

    /* 查询 */
    /* 根据主键查询 */
    public List<Singer> selectBySingerId(Integer id);

    /* 查询所有歌手 */
    public List<Singer> selectAllSinger();

    /* 根据歌手名称模糊查询 */
    public List<Singer> selectBySingerName(String subname);
}
