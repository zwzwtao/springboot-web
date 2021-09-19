package com.odas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

// 在templates目录下的所有页面，只能通过controller来跳转
// 这个需要模板引擎的支持，thymeleaf
@Controller
public class IndexController {

    @RequestMapping("/test")
    public String test(Model model) {
        model.addAttribute("msg", "<h1>Hello Spring Boot</h1>");

        // asList把数组转换成一个集合
        model.addAttribute("users", Arrays.asList("odas", "tao"));

        return "test";
    }
}
