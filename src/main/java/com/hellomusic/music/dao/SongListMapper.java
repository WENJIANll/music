package com.hellomusic.music.dao;

import com.hellomusic.music.domain.Song;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongListMapper {
    /* 增加 */
    public int insert(Song song);

    /* 修改 */
    public int modify(Song song);

    /* 删除 */
    public int delete(Integer id);

    /* 查询 */
    /* 根据主键查询 */
    public List<Song> selectBySongId(Integer id);

    /* 查询所有歌手 */
    public List<Song> selectAllSong();

    /* 根据歌手名称模糊查询 */
    public List<Song> selectBySongName(String subname);
}