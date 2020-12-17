package com.hellomusic.music.service.impl;

import com.hellomusic.music.dao.AdminMapper;
import com.hellomusic.music.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 管理员service实现类
 * */

// 供controller来调用
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    /**
     * 验证密码
     *
     * @param username
     * @param password
     */
    @Override
    public boolean vertifyPassword(String username, String password) {
        return adminMapper.vertifyPassword(username, password) > 0;
    }
}
