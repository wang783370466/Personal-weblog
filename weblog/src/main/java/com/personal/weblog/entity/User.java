package com.personal.weblog.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class User implements Serializable {
    private Long id;

    private String name;

    private Integer age;

    private String real_name;

    private Byte certificate_type;

    private String certificate_info;

    private String email;

    private String address;

    private String birthday;

    private String password;

    private Date gmt_create;

    private Date gmt_modify;

    private Long operator_id;

    private String operator_name;

    private Boolean is_deleted;

    private static final long serialVersionUID = 1L;

}