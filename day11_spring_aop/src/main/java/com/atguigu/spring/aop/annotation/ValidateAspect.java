package com.atguigu.spring.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author xujian
 * @create 2023-01-11 9:47
 *
 * 登录验证功能，我们希望其在日志功能前执行
 */
@Component
@Aspect
@Order(2)
public class ValidateAspect {
    //设置通用的切入点表达式
//    @Pointcut("execution(public int com.atguigu.spring.aop.annotation.CalculatorImpl.*(int int))")
//    @Pointcut("execution(* com.atguigu.spring.aop.annotation.CalculatorImpl.*(..))")
    @Pointcut("execution(* com.atguigu.spring.aop.annotation.*.*(..))")
    public void pointCut(){

    }
    //1.前置方法
    @Before("pointCut()")
    public void beforeAdviceMethod(JoinPoint joinPoint){
        System.out.println("【验证功能：】验证成功");
    }
}
