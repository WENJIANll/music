package com.hellomusic.music.service;

import com.hellomusic.music.domain.Singer;

import java.util.List;

public interface SingerService {

    /* 增加 */
    public boolean insert(Singer singer);

    /* 修改 */
    public boolean modify(Singer singer);

    /* 删除 */
    public boolean delete(Integer id);

    /* 查询 */
    /* 根据主键查询 */
    public List<Singer> selectBySingerId(Integer id);

    /* 查询所有歌手 */
    public List<Singer> selectAllSinger();

    /* 根据歌手名称模糊查询 */
    public List<Singer> selectBySingerName(String subname);
}
