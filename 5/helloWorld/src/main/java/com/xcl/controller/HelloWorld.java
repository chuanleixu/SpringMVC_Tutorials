package com.xcl.controller;

import com.xcl.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/**
 * @author chuanlei.xu
 * @version 1.0
 * @date 2019/2/20 11:02
 */
@SessionAttributes(value = "user",types = String.class)
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
    public String testRestDelete(@PathVariable("id") Integer id){
        System.out.println("testRest DELETE:" +id);
        return "success";
    }

    @RequestMapping(value = "/testRest/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public String testRestPut(@PathVariable Integer id){
        System.out.println("testRest PUT:" +id);
        return "success";
    }

    @RequestMapping(value = "/testRequestParam")
    public String testRequestParam(@RequestParam(value = "username") String username,
                                   @RequestParam(value = "age",required = false) String age){
        System.out.println("testRequestParam,username " +username+" age "+age);
        return "success";
    }

    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept-Language") String al){
        System.out.println("testRequestHeader,Accept-Language "+al );
        return "success";
    }


    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String sessionId){
        System.out.println("testCookieValue,JSESSIONID "+sessionId );
        return "success";
    }

    @RequestMapping("/testPojo")
    public String testPojo(User user){
        System.out.println("testPojo"+user );
        return "success";
    }

    @RequestMapping("/testServletAPI")
    public void testServletAPI(HttpServletRequest request, HttpServletResponse response, Writer out) throws IOException {
        System.out.println("testServletAPI, "+request+" , "+response );
        out.write("hello SpringMVC");
       // return "success";
    }


    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){

        String viewName = "success";
        ModelAndView modelAndView=new ModelAndView(viewName);

        modelAndView.addObject("time",new Date());
        return modelAndView;
    }

    @RequestMapping("/testMap")
    public String testMap(Map<String,Object> map){
        map.put("names", Arrays.asList("tom","Jerry","Mike"));

        return "success";
    }

    @RequestMapping("/testSessionAttributes")
    public String testSessionAtrributes(Map<String,Object> map){
        User user = new User("tom","1222","chuanlei@qq.com",15);
        map.put("user",user);
        map.put("school","yizhong");

        return "success";
    }

    //被@ModelAttribute注释的方法会在此controller每个方法执行前被执行
    @ModelAttribute
    public void getUser(@RequestParam(value = "id",required = false) Integer id,Map<String,Object> map){
        if(id != null){
            User user = new User(1,"Tom","123456","Tom@qq.com",12);
           // System.out.println("user demo"+user);
            map.put("user",user);
        }

    }


    /**
     *运行流程：
     * 1.执行@ModelAttribute 注解修饰的方法：从数据库中取出对象，把对象放入到map中，键为user
     * 2.SpringMVC从map中取出User对象，并把表单中的请求参数赋给该User对象 的对应属性
     * 3.SpringMVC 把上述对象传入目标方法的参数
     *
     * 注意：在@ModelAttribute 修饰的方法中放入到map 时的键需要和目标方法入参类型的第一个字母小写的字符串一致！
     */
    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("user") User user){
        System.out.println("change:"+user);
        return "success";
    }

}
