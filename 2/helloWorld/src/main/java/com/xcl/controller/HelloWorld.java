package com.xcl.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chuanlei.xu
 * @version 1.0
 * @date 2019/2/20 11:02
 */
@RequestMapping("springmvc")
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
    /*
    *
    * 使用method属性来指定请求方式
    *
    * */
    @RequestMapping(value ="testMethod",method = RequestMethod.POST)
    public String testMethod(){

        System.out.print("testMethod");
        return "success";
    }

    /*
    * 可以使用params和heads来更加精确的映射请求。params和headers支持简单的表达式。
    * */
    @RequestMapping(value = "testParamsAndHeaders",params = {"username","age!=10"},headers = {"Accept-Language: zh-CN,zh;q=0.9"})
    public String testParamsAndHeaders(){
        System.out.print("testParamsAndHeaders");
        return "success";
    }

    /*
    * @PathVariable 可以映射URL 中的占位符到目标方法的参数中
    * */
    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable("id") Integer id){
        System.out.println("testPathVariable:"+id);
        return "success";
    }

    @RequestMapping(value = "/testRest/{id}",method = RequestMethod.GET)
    public String testRest(@PathVariable Integer id){
        System.out.println("testRest GET:" +id);
        return "success";
    }

    @RequestMapping(value = "/testRest",method = RequestMethod.POST)
    public String testRest(){
        System.out.println("testRest POST:");
        return "success";
    }

    @RequestMapping(value = "/testRest/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String testRestDelete(@PathVariable Integer id){
        System.out.println("testRest DELETE:" +id);
        return "success";
    }

    @RequestMapping(value = "/testRest/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public String testRestPut(@PathVariable Integer id){
        System.out.println("testRest PUT:" +id);
        return "success";
    }
}
