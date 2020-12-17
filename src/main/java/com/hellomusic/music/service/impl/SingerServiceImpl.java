package com.hellomusic.music.service.impl;

import com.hellomusic.music.dao.SingerMapper;
import com.hellomusic.music.domain.Singer;
import com.hellomusic.music.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SingerServiceImpl implements SingerService {

    @Autowired
    private SingerMapper singerMapper;

    @Override
    public boolean insert(Singer singer) {
        return singerMapper.insert(singer) > 0;
    }

    @Override
    public boolean modify(Singer singer) {
        return singerMapper.modify(singer) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return singerMapper.delete(id) > 0;
    }

    @Override
    public List<Singer> selectBySingerId(Integer id) {
        return singerMapper.selectBySingerId(id);
    }

    @Override
    public List<Singer> selectAllSinger() {
        return singerMapper.selectAllSinger();
    }

    @Override
    public List<Singer> selectBySingerName(String subname) {
        return singerMapper.selectBySingerName(subname);
    }
}
