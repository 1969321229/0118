package com.jk.controller;

import com.jk.bean.Book;
import com.jk.bean.Boostrap;
import com.jk.bean.SendPage;
import com.jk.service.DiaoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class BookController {
    @Resource
    DiaoService diaoService;

    @ResponseBody
    @RequestMapping("addUser")
    public String addUser(Book t) {
        diaoService.addUser(t);
        return "1";
    }

    //bootstrap查询getTableData
    @ResponseBody
    @RequestMapping("getTableData")
    public SendPage getTableData(Book t, Integer pageSize, Integer offset) {
        SendPage sendPage = diaoService.getTableData(t, pageSize, offset);
        return sendPage;
    }

    @ResponseBody
    @RequestMapping("getTreeBoot")
    public List<Boostrap> getTreeBoot() {
        List<Boostrap> boot = diaoService.getTreeBoot();
        return boot;
    }

}
