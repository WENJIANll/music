package com.hellomusic.music.utils;

import com.hellomusic.music.domain.Singer;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 常量
 * */
public class Consts {
    /* 登录名 */
    public static final String NAME = "name";
    /* 返回码 */
    public static final String CODE = "code";
    /* 返回信息 */
    public static final String MSG = "msg";
    /* 返回对象 */
    public static final String OBJ = "obj";

    public static Singer reSinger(HttpServletRequest request){
//        String id = request.getParameter("id").trim();          //主键
        String name = request.getParameter("name").trim();      //姓名
        String sex = request.getParameter("sex").trim();        //性别
        String birth = request.getParameter("birth").trim();    //生日
        String location = request.getParameter("location").trim();//地区
        String introduction = request.getParameter("introduction").trim();//简介
        //把生日转换成Date格式
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDate = new Date();
        try {
            birthDate = dateFormat.parse(birth);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //保存到歌手的对象中
        Singer singer = new Singer();
//        singer.setId(Integer.parseInt(id));
        singer.setName(name);
        singer.setSex(Byte.valueOf(sex));
        singer.setBirth(birthDate);
        singer.setLocation(location);
        singer.setIntroduction(introduction);
        return singer;
    }
}
