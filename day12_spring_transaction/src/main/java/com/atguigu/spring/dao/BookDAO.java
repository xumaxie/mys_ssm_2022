package com.atguigu.spring.dao;

/**
 * @author xujian
 * @create 2023-01-11 16:02
 */
public interface BookDAO {
    /**
     * 查询图像价格
     * @param bookId
     * @return
     */
    Integer getBookPriceById(Integer bookId);

    /**
     * 更新图书库存
     * @param bookId
     */
    void updateStockById(Integer bookId);

    /**
     * 更新用户余额
     * @param userId
     * @param price
     */
    void updateSalaryById(Integer userId, Integer price);
}
