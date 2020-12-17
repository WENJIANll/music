package com.hellomusic.music.service;


// 管理员service接口
public interface AdminService {
    /**
     * 验证密码
     * */
    public boolean vertifyPassword(String username,String password);
}
