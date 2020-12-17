package com.hellomusic.music.service.impl;

import com.hellomusic.music.dao.SongListMapper;
import com.hellomusic.music.domain.Song;
import com.hellomusic.music.service.SongListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongListServiceImpl implements SongListService {

    @Autowired
    private SongListMapper songListMapper;

    @Override
    public boolean insert(Song song) {
        return songListMapper.insert(song) > 0;
    }

    @Override
    public boolean modify(Song song) {
        return songListMapper.modify(song) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return songListMapper.delete(id) > 0;
    }

    @Override
    public List<Song> selectBySongId(Integer id) {
        return songListMapper.selectBySongId(id);
    }

    @Override
    public List<Song> selectAllSong() {
        return songListMapper.selectAllSong();
    }

    @Override
    public List<Song> selectBySongName(String subname) {
        return songListMapper.selectBySongName(subname);
    }
}
