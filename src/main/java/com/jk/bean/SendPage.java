package com.jk.bean;

import java.io.Serializable;
import java.util.List;

public class SendPage implements Serializable {
    private Integer total;  //总条数

    private List rows;  //分页后的数据

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public SendPage(Integer total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public SendPage() {
    }
}
