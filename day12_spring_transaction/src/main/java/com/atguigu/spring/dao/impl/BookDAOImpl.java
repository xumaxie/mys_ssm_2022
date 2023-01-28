package com.atguigu.spring.dao.impl;

import com.atguigu.spring.dao.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author xujian
 * @create 2023-01-11 16:02
 */

@Repository
public class BookDAOImpl implements BookDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    /**
     * 查询图像价格
     *
     * @param bookId
     * @return
     */
    @Override
    public Integer getBookPriceById(Integer bookId) {
        String sql = "select price from t_book where book_id=?";
        return jdbcTemplate.queryForObject(sql, Integer.class, bookId);
    }

    /**
     * 更新图书库存
     *
     * @param bookId
     */
    @Override
    public void updateStockById(Integer bookId) {
        String sql="update t_book set stock = stock-1 where book_id=?";
        jdbcTemplate.update(sql, bookId);
    }

    /**
     * 更新用户余额
     *
     * @param userId
     * @param price
     */
    @Override
    public void updateSalaryById(Integer userId, Integer price) {
        String sql="update t_user set balance = balance-? where user_id =?";
        jdbcTemplate.update(sql,price,userId);
    }
}
