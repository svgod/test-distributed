package com.wyx.demo.ssmdemo.api.request;

import lombok.Data;

@Data
public class UserInfoQueryByIdRequest {

    /**
     * 通过编码ID来寻找
     */
    private Integer id;
}
