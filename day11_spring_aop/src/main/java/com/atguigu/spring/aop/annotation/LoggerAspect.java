package com.atguigu.spring.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author xujian
 * @create 2023-01-11 9:00
 *
 * 基于注解实现aop:
 * LoggerAspect日志切面
 */

@Component
@Aspect
public class LoggerAspect {
    //设置通用的切入点表达式
//    @Pointcut("execution(public int com.atguigu.spring.aop.annotation.CalculatorImpl.*(int int))")
//    @Pointcut("execution(* com.atguigu.spring.aop.annotation.CalculatorImpl.*(..))")
    @Pointcut("execution(* com.atguigu.spring.aop.annotation.*.*(..))")
    public void pointCut(){

    }
    //1.前置方法
    @Before("pointCut()")
    public void beforeAdviceMethod(JoinPoint joinPoint){
        //获取函数签名信息
        String methodName = joinPoint.getSignature().getName();
        //获取参数列表
        Object[] args = joinPoint.getArgs();
        System.out.println("【函数日志-before】函数执行之前：函数" + methodName + ";函数参数为" + Arrays.toString(args));
    }
    //2.后置方法
    @After("pointCut()")
    public void afterAdviceMethod(JoinPoint joinPoint){
        //获取函数签名信息
        String methodName = joinPoint.getSignature().getName();
        //获取参数列表
        Object[] args = joinPoint.getArgs();
        System.out.println(("【函数日志-after】函数执行之后：函数" + methodName + "执行完毕。"));
    }
    //3.返回方法
    @AfterReturning(value="pointCut()",returning = "result")
    public void afterReturningAdviceMethod(JoinPoint joinPoint, Object result){
        //获取函数签名信息
        String methodName = joinPoint.getSignature().getName();
        //获取函数执行结果result
        System.out.println("【函数日志-return】函数返回值：函数名为" + methodName + "结果为："+result);
    }
    //4.异常方法
    @AfterThrowing(value = "pointCut()",throwing = "th")
    public void afterThrowingAdviceMethod(JoinPoint joinPoint,Throwable th){
        //获取函数签名信息
        String methodName = joinPoint.getSignature().getName();
        //获取异常信息th
        System.out.println("【函数日志-thorwable】函数出现异常：函数名为-" + methodName + ";异常是："+th);
    }
    //5.环绕方法
    @Around("pointCut()")
    public Object aroundAdviceMethod(ProceedingJoinPoint joinPoint){
        Object proceed=null;
        try {
            //获取函数签名信息
            String methodName = joinPoint.getSignature().getName();
            //获取参数列表
            Object[] args = joinPoint.getArgs();
            System.out.println("【函数日志-around】前置通知：函数" + methodName);
            proceed = joinPoint.proceed();
            System.out.println("【函数日志-around】返回通知：函数" + methodName+"返回值："+proceed);
        } catch (Throwable throwable) {
            System.out.println("【函数日志-around】异常通知");
        } finally {
            System.out.println("【函数日志-around】-->后置通知");
        }
        return proceed;
    }


}
