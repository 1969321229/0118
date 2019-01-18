package com.jk.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.bean.Book;
import com.jk.bean.Boostrap;
import com.jk.bean.SendPage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiaoServiceImpl implements DiaoService {

    @Reference
    BookService bookService;

    @Override
    public void addUser(Book t) {
        bookService.addUser(t);
    }

    @Override
    public SendPage getTableData(Book t, Integer pageSize, Integer offset) {
        return bookService.getTableData(t, pageSize, offset);
    }

    @Override
    public List<Boostrap> getTreeBoot() {
        return bookService.getTreeBoot();
    }
}
