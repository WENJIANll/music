package com.hellomusic.music.dao;

import com.hellomusic.music.domain.Song;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongMapper {
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

    /* 根据歌手id查询 */
    public List<Song> selectBysingerId(Integer id);

    /* 根据歌手名称模糊查询 */
    public List<Song> selectBySongName(String subname);

    /* 根据歌曲名称模糊查询 */
    public List<Song> selectByLikeSongName(String subname);
}
