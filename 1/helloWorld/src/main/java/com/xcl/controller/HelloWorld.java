package com.xcl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chuanlei.xu
 * @version 1.0
 * @date 2019/2/20 11:02
 */

@Controller
public class HelloWorld {
    /*
    * 使用@RequestMapping来映射请求的url
    *
    */
    @RequestMapping("/helloworld")
    public String helloworld(){

        System.out.print("hello world");
        return "success";
    }
}
