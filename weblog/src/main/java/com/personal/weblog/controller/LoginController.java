package com.personal.weblog.controller;

import com.alibaba.fastjson.JSON;
import com.personal.weblog.entity.User;
import com.personal.weblog.enums.ResultEnum;
import com.personal.weblog.req.LoginReq;
import com.personal.weblog.resp.RpcResultResp;
import com.personal.weblog.service.UserService;
import com.personal.weblog.utils.RpcResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @program: Personal-weblog
 * @description: user login
 * @author: wangleilei
 * @create: 2021-01-21 23:15
 **/

@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
   /* public String userLogin(@RequestParam("userName") String userName,
                            @RequestParam("password") String password){

        if(StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)){
            return "参数缺失，请重新登录！";
        }
        User user = userService.queryByName(userName);
        if(Objects.isNull(user) || !password.equals(user.getPassword())){
            return "账号密码不正确";
        }
        return "登录成功";

    }*/
    /*public String userLogin(@RequestBody LoginReq  loginReq) {
        if (StringUtils.isEmpty(loginReq.getUserName()) || StringUtils.isEmpty(loginReq.getPassword())) {
            return "参数缺失，请重新登录！";
        }
        User user = userService.queryByName(loginReq.getUserName());
        if (Objects.isNull(user) || !loginReq.getPassword().equals(user.getPassword())) {
            return "账号密码不正确";
        }
        return "登录成功";
    }*/

    public RpcResultResp userLogin(@RequestBody String jsonParam) {

        RpcResultResp rpcResultResp = new RpcResultResp();
        //使用fastJson工具将json字符串转换为实体类
        LoginReq  loginReq = JSON.parseObject(jsonParam, LoginReq.class);
        //参数缺失
        if (StringUtils.isEmpty(loginReq.getUserName()) || StringUtils.isEmpty(loginReq.getPassword())) {
            return RpcResultUtils.buildSuccessResult(ResultEnum.MISSING_PARAM);
        }
        User user = userService.queryByName(loginReq.getUserName());
        //账号密码不匹配
        if (Objects.isNull(user) || !loginReq.getPassword().equals(user.getPassword())) {
            return RpcResultUtils.buildSuccessResult(ResultEnum.ERROR_ACOUNT);
        }
        return RpcResultUtils.buildSuccessResult();
    }

    @RequestMapping("regist")
    public void regist(@RequestBody User user){
        userService.inserUser(user);
    }



}
