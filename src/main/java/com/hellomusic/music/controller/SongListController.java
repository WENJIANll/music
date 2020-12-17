package com.hellomusic.music.controller;


import com.hellomusic.music.service.SongListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/songList")
public class SongListController {

    @Autowired
    private SongListService songListService;

    @RequestMapping(value = "/allSongList", method = RequestMethod.GET)
    public Object allSinger(HttpServletRequest request) {
        return songListService.selectAllSong();
    }
}
