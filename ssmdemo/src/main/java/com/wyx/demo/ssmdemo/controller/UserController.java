package com.wyx.demo.ssmdemo.controller;

import com.wyx.demo.ssmdemo.dao.UserInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class UserController {

    @Autowired
    UserInfoDao userInfoDao;

    public void testSaveUser(){

    }
}
