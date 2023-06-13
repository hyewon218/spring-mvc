package com.sparta.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
// /api로 시작되는 요청은 이 class로 넘어온다.
// @RequestMapping 중복되는 URL를 단축시켜 줌!
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World!!";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get() {
        return "Get Method 요청";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post() {
        return "POST Method 요청";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put() {
        return "PUT Method 요청";
    }

    @DeleteMapping("/api/delete")
    @ResponseBody
    public String delete() {
        return "DELETE Method 요청";
    }
}
