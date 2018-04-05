package com.alibaba.dubbo.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
public class User implements Serializable {



    private Long userId;

    private String userName;

    private String password;

    private String address;


    private String sex;


    private String email;
}
