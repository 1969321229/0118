package com.jk.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Book implements Serializable {
    private Integer id;
    private String name;
    private Integer price;
    private String timg;
   /* @JsonFormat(pattern="yyyy-MM-dd hh24:mi:ss",timezone="GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd hh24:mi:ss")*/
    private Date tdate;
    private Integer state;
}

