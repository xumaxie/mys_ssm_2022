package com.atguigu.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author xujian
 * @create 2023-01-15 22:39
 */
@ControllerAdvice
public class ExceptionHandderTest {
    @ExceptionHandler(ArithmeticException.class)
    public String test(Exception ex,Model model){
        model.addAttribute("ex", ex);
        return "error";
    }
}
