package com.personal.weblog.enums;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @program: Personal-weblog
 * @description: exception enum
 * @author: wangleilei
 * @create: 2021-01-23 13:14
 **/

public enum ResultEnum {
    SUCCESSFUL(0, "操作成功"),
    MISSING_PARAM(1, "参数缺失"),
    ERROR_ACOUNT(2, "账号密码错误") ;

    @Setter
    @Getter
    private Integer code;

    @Setter
    @Getter
    private String desc;

    ResultEnum(Integer code, String desc){
        this.code = code;
        this.desc = desc;
    }

    private static Map<Integer, ResultEnum> enumMap = new HashMap<>();

    public static ResultEnum byCode(Integer code){
        List<Map<String,Object>> result = new ArrayList<>();
        if(CollectionUtils.isEmpty(enumMap)){
            Arrays.stream(ResultEnum.values()).collect(Collectors.toList()).forEach(i -> enumMap.put(i.getCode(), i));
        }
        return enumMap.get(code);
    }

}
