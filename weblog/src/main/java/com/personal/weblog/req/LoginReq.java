package com.personal.weblog.req;

import lombok.Data;

/**
 * @program: Personal-weblog
 * @description: login request param
 * @author: wangleilei
 * @create: 2021-01-21 23:19
 **/
@Data
public class LoginReq {

    private String userName;

    private String password;

    private String sign;
}
