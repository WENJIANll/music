package com.hellomusic.music.controller;

import com.hellomusic.music.dao.BlogTypeMapper;
import com.hellomusic.music.domain.BlogType;
import com.hellomusic.music.service.BlogTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/blogsType")
public class BlogTypeController {

    @Autowired
    private BlogTypeService blogTypeService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Object addBlogType(HttpServletRequest request){
        BlogType blogType = new BlogType();
        String name = request.getParameter("name");
        String descc = request.getParameter("descc");
        blogType.setDesc(descc);
        blogType.setName(name);
        return blogTypeService.addBlogType(blogType);
    }

    @RequestMapping(value = "/selectall",method = RequestMethod.GET)
    public Object selectAllBlogType(HttpServletRequest request){
        return blogTypeService.selectAllBlogType();
    }
}
