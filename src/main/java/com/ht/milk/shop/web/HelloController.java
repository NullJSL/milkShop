package com.ht.milk.shop.web;

import com.ht.milk.shop.bean.UserProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/api")
public class HelloController {

//    @Value("${name}")     //从application.properties 取name: 张三
//    private String name;    //
//
//    @Value("${age}")
//    private Integer age;
//
//    @Value("${content}")
//    private String content;

    @Autowired
    private UserProperties userProperties;

    @RequestMapping(value = "/hello")
    @ResponseBody
    public ModelAndView hello(){
        //return content;
        //return "Heloise" + name+ age +"/"+userProperties.getName() + "age:"+userProperties.getAge();
        return new ModelAndView("index");
    }

//    @RequestMapping(value = "/configHomePage")
//    public ModelAndView configHomePage(ModelMap model){
//        //查询出所有的app
//        //List<CheckApp> checkMajors = checkAppService.queryAllApp();
//        model.addAttribute("checkMajors",checkMajors);
//        return new ModelAndView("config");
//    }
}
