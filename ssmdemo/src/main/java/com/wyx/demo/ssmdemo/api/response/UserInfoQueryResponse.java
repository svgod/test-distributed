package com.wyx.demo.ssmdemo.api.response;

import lombok.Data;

@Data
public class UserInfoQueryResponse {

    /**
     * 唯一编码id
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 密码
     */
    private String passWord;
}
