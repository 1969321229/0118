package com.jk.service;

import com.jk.bean.Book;
import com.jk.bean.Boostrap;
import com.jk.bean.SendPage;

import java.util.List;

public interface BookService {
    void addUser(Book t);

    SendPage getTableData(Book t, Integer pageSize, Integer offset);

    List<Boostrap> getTreeBoot();
}
