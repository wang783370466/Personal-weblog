package com.personal.weblog.utils;

import com.personal.weblog.resp.ResultResp;

/**
 * @program: Personal-weblog
 * @description:
 * @author: wangleilei
 * @create: 2021-01-22 17:09
 **/

public class RpcResultUtils {
    private static final int SUCCESS = 200;

    public RpcResultUtils() {
    }

    public static ResultResp buildSuccessResult() {
        ResultResp rpcResult = new ResultResp();
        rpcResult.setCode(200);
        rpcResult.setMsg("success");
        return rpcResult;
    }

    public static ResultResp buildErrorResult(int code, String msg) {
        ResultResp rpcResult = new ResultResp();
        rpcResult.setCode(code);
        rpcResult.setMsg(msg);
        return rpcResult;
    }

    public static ResultResp buildDataResult(String msg, Object object){
        ResultResp resultResp = new ResultResp();
        resultResp.setCode(200);
        resultResp.setMsg(msg);
        resultResp.setObject(object);
        return resultResp;
    }
}

