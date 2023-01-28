package com.atguigu.spring.controller;

import com.atguigu.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author xujian
 * @create 2023-01-11 16:01
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    public void buyBook(Integer userId,Integer bookId){
//        买书三个步骤：
//        1.先查询price,
//        2.然后更新库存stock，
//        3.然后修改用户的balance余额
        bookService.buyBook(userId, bookId);
        System.out.println("成功买书");
    }

}
