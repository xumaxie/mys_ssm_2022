package com.atguigu.spring.test.proxy;

import com.atguigu.spring.proxy.Calculator;
import com.atguigu.spring.proxy.CalculatorImpl;
import com.atguigu.spring.proxy.ProxyFactory;
import org.junit.Test;

/**
 * @author xujian
 * @create 2023-01-10 17:44
 */
public class TestDynamicProxy {
    @Test
    public void testOne(){
        //创建一个target
        CalculatorImpl target = new CalculatorImpl();
        //获取一个代理工厂
        ProxyFactory proxyFactory = new ProxyFactory(target);
        //使用代理工厂获取代理(该代理我们可以强转我们需要的类型（这里我们设置为Calculator）)
        Calculator calculator = (Calculator) proxyFactory.getProxy();
        System.out.println(calculator);
        System.out.println("_________________--------");
        int add = calculator.add(1, 2);

    }
}
