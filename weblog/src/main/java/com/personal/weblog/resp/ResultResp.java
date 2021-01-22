package com.personal.weblog.resp;

import lombok.Data;

/**
 * @program: Personal-weblog
 * @description: result data
 * @author: wangleilei
 * @create: 2021-01-22 17:12
 **/
@Data
public class ResultResp {

    private Integer code;

    private String msg;

    private Object object;
}
