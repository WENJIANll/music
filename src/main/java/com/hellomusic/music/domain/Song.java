package com.hellomusic.music.domain;

import java.io.Serializable;
import java.util.Date;

public class Song implements Serializable {
    private Integer id;
    private String name;
    private Byte sex;
    /* 头像 */
    private String pic;
    private Date birth;
    private String location;
    private String introduction;
}
