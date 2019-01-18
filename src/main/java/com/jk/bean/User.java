package com.jk.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private Integer id;
    private String username;
    private String userpass;
    private Integer role;
}
