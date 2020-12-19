package com.hellomusic.music.service.impl;

import com.hellomusic.music.dao.SongMapper;
import com.hellomusic.music.domain.Song;
import com.hellomusic.music.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {

    @Autowired
    private SongMapper songMapper;

    @Override
    public boolean insert(Song song) {
        return songMapper.insert(song) > 0;
    }

    @Override
    public boolean modify(Song song) {
        return songMapper.modify(song) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return songMapper.delete(id) > 0;
    }

    @Override
    public List<Song> selectBySongId(Integer id) {
        return songMapper.selectBySongId(id);
    }

    @Override
    public List<Song> selectBysingerId(Integer id) {
        return songMapper.selectBysingerId(id);
    }

    @Override
    public List<Song> selectAllSong() {
        return songMapper.selectAllSong();
    }

    @Override
    public List<Song> selectBySongName(String subname) {
        return songMapper.selectBySongName(subname);
    }

    @Override
    public List<Song> selectByLikeSongName(String subname) {
        return songMapper.selectByLikeSongName(subname);
    }
}
