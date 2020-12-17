package com.hellomusic.music.service;

import com.hellomusic.music.domain.Song;

import java.util.List;

public interface SongListService {
    /* 增加 */
    public boolean insert(Song song);

    /* 修改 */
    public boolean modify(Song song);

    /* 删除 */
    public boolean delete(Integer id);

    /* 查询 */
    /* 根据主键查询 */
    public List<Song> selectBySongId(Integer id);

    /* 查询所有歌手 */
    public List<Song> selectAllSong();

    /* 根据歌手名称模糊查询 */
    public List<Song> selectBySongName(String subname);
}
