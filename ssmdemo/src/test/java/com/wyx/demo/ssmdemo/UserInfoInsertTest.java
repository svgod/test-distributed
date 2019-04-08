package com.wyx.demo.ssmdemo;

import com.wyx.demo.ssmdemo.dao.UserInfoDao;
import com.wyx.demo.ssmdemo.dto.UserInfo;
import com.wyx.demo.ssmdemo.service.UserInfoInsertService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoInsertTest {

    @Autowired
    private UserInfoInsertService userInfoInsertService;

    @Test
    public void userInfoInsertTest(){
        UserInfo userInfo=new UserInfo();
        userInfo.setId(5);
        userInfo.setUserName("ppy");
        userInfo.setPassword("Liquid");
        userInfoInsertService.saveUser(userInfo);

    }
}
