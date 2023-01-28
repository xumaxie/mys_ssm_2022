package com.atguigu.spring.service.impl;

import com.atguigu.spring.dao.BookDAO;
import com.atguigu.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

/**
 * @author xujian
 * @create 2023-01-11 16:02
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDAO bookDAO;


    @Override
    @Transactional(
//            readOnly = true,
            timeout= 3
    )
    public void buyBook(Integer userId, Integer bookId) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*
        买书三个步骤：
            1.先查询price,
            2.然后更新库存stock，
            3.然后修改用户的balance余额
        */
        //1.
        Integer price = bookDAO.getBookPriceById(bookId);
        //2.
        bookDAO.updateStockById(bookId);
        //3.
        bookDAO.updateSalaryById(userId,price);



    }
}
