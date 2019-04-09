package com.wyx.demo.ssmdemo.api;

import com.wyx.demo.ssmdemo.api.request.UserInfoQueryByIdRequest;
import com.wyx.demo.ssmdemo.api.response.UserInfoQueryResponse;


public interface UserQueryApi {


    UserInfoQueryResponse queryUserById(UserInfoQueryByIdRequest request);
}
