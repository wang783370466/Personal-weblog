package com.personal.weblog.utils;

import com.personal.weblog.enums.ResultEnum;
import com.personal.weblog.resp.RpcResultResp;

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

    public static RpcResultResp buildSuccessResult() {
        RpcResultResp rpcResult = new RpcResultResp();
        rpcResult.setCode(SUCCESS);
        rpcResult.setMsg("success");
        return rpcResult;
    }

    public static RpcResultResp buildSuccessResult(Object object) {
        RpcResultResp rpcResult = new RpcResultResp();
        rpcResult.setCode(SUCCESS);
        rpcResult.setMsg("success");
        rpcResult.setObject(object);
        return rpcResult;
    }

    public static RpcResultResp buildSuccessResult(ResultEnum resultEnm) {
        RpcResultResp rpcResult = new RpcResultResp();
        rpcResult.setCode(resultEnm.getCode());
        rpcResult.setMsg(resultEnm.getDesc());
        return rpcResult;
    }

    public static RpcResultResp buildDataResult(int code, String msg, Object object){
        RpcResultResp rpcResultResp = new RpcResultResp();
        rpcResultResp.setCode(code);
        rpcResultResp.setMsg(msg);
        rpcResultResp.setObject(object);
        return rpcResultResp;
    }

    public static RpcResultResp buildMsgResult(int code, String msg){
        RpcResultResp rpcResultResp = new RpcResultResp();
        rpcResultResp.setCode(code);
        rpcResultResp.setMsg(msg);
        return rpcResultResp;
    }
}

