package com.atguigu.spring.test.proxy;

import com.atguigu.spring.proxy.CalculatorImpl;
import com.atguigu.spring.proxy.CalculatorStaticProxy;
import org.junit.Test;

/**
 * @author xujian
 * @create 2023-01-10 16:12
 */
public class TestProxy {

    @Test
    public void testStaticProxy(){
        CalculatorStaticProxy staticProxy = new CalculatorStaticProxy(new CalculatorImpl());
        int add = staticProxy.add(1, 2);

    }
}
