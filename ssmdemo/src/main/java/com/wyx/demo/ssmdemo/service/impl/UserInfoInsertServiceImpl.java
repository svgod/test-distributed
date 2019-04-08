package com.wyx.demo.ssmdemo.service.impl;

import com.wyx.demo.ssmdemo.dao.UserInfoDao;
import com.wyx.demo.ssmdemo.dto.UserInfo;
import com.wyx.demo.ssmdemo.service.UserInfoInsertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserInfoInsertServiceImpl implements UserInfoInsertService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Transactional
    @Override
    public int saveUser(UserInfo userInfo) {
        return userInfoDao.saveUserInfo(userInfo);
    }
}
