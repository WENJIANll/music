package com.hellomusic.music.dao;


import org.springframework.stereotype.Repository;


// service就可以调用了
@Repository
public interface AdminMapper {
    // 验证密码是否正确
    public int vertifyPassword(String username,String password);
}
