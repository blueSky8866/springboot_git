package com.qianfeng.springboot_git.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @auther liaobifeng
 * @Date 2019/6/9
 */
@Controller
@RequestMapping("our")
public class OurController {
   @RequestMapping("hello")
   @ResponseBody
    public String hello(){
       System.out.println("hello.world!!!!!!");
       return "hello";
    }
}
