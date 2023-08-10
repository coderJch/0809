package com.itheima.controller;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jiangchenhui
 * @date ：Created in 2023/8/9
 * @description ：
 * @version: 1.0
 */

@RestController
public class HelloController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/hello")
    public User heello(){

        return userMapper.selectByPrimaryKey(1);

    }
}
