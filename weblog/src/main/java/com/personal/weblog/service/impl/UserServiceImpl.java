package com.personal.weblog.service.impl;


import com.personal.weblog.entity.User;
import com.personal.weblog.mapper.UserMapper;
import com.personal.weblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: Personal-weblog
 * @description:
 * @author: wangleilei
 * @create: 2021-01-21 23:30
 **/
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryByName(String userName) {
        User user = userMapper.queryByName(userName);
        return user;
    }

    @Override
    public void inserUser(User user) {
        userMapper.insert(user);
    }
}
