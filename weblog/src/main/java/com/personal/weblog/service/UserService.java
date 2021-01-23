package com.personal.weblog.service;

import com.personal.weblog.entity.User;

/**
 * @program: Personal-weblog
 * @description: user service
 * @author: wangleilei
 * @create: 2021-01-21 23:28
 **/

public interface UserService {
    User queryByName(String userName);

    void inserUser(User user);
}
