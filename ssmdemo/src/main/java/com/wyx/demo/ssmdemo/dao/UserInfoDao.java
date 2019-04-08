package com.wyx.demo.ssmdemo.dao;

import com.wyx.demo.ssmdemo.dto.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserInfoDao {

    int saveUserInfo(@Param("entity") UserInfo user);

}
