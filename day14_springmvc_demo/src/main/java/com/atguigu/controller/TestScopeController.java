package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author xujian
 * @create 2023-01-13 21:07
 * 总结
 * * 向域对象共享数据：
 *  * 1、通过ModelAndView向请求域共享数据
 *  * 使用ModelAndView时，可以使用其Model功能向请求域共享数据
 *  * 使用View功能设置逻辑视图，但是控制器方法一定要将ModelAndView作为方法的返回值
 *  * 2、使用Model向请求域共享数据
 *  * 3、使用ModelMap向请求域共享数据
 *  * 4、使用map向请求域共享数据
 *  * 5、Model和ModelMap和map的关系
 *  * 其实在底层中，这些类型的形参最终都是通过BindingAwareModelMap创建
 *  * public class BindingAwareModelMap extends ExtendedModelMap {}
 *  * public class ExtendedModelMap extends ModelMap implements Model {}
 *  * public class ModelMap extends LinkedHashMap<String, Object> {}
 */
@Controller
public class TestScopeController {

    @RequestMapping("/test/scope01")
    public ModelAndView testModelAndView(){
        ModelAndView mav = new ModelAndView();
        //1，向请求域中共享数据
        mav.addObject("testModelAndView", "Hello,ModelAndView");
        //2.设计逻辑视图
        mav.setViewName("success");  //我们在success接收这个testRequestScope将值展示出来
        return mav;
    }

    @RequestMapping("/test/scope02")
    public String testModel(Model model){
        System.out.println(model.getClass().getName());
        model.addAttribute("testModel", "Hello,Model");
        return "success";
    }

    @RequestMapping("/test/scope03")
    public String testModelMap(ModelMap modelMap){
        System.out.println(modelMap.getClass().getName());
        modelMap.addAttribute("testModelMap", "Hello,ModelMap");
        return "success";
    }

    @RequestMapping("/test/scope04")
    public String testMap(Map<String,Object> map){
        System.out.println(map.getClass().getName());
        map.put("testMap", "Hello,Map");
        return "success";
    }
}
