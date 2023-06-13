package com.sparta.springmvc.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    private static long visitCount = 0;

    @GetMapping("/static-hello")
    // @Controller 를 달고 반환타입을 String으로 하면
    // String 이름에 부합하는 페이지를 찾아서 반환을 한다.
    public  String hello() {
        return "hello.html";
    }

    @GetMapping("/html/redirect")
    public String htmlStatic() {
        // redirect(재호출)/hello.html(직접접근하는 경로(localhost 생략이 가능))
        return "redirect:/hello.html";
    }

    @GetMapping("/html/templates")
    public String Templates() {
        return "hello";
    }

    @GetMapping("/html/dynamic")
    public String htmlDynamic(Model model) {
        // 이 요청이 들어 오면 visitCount를 하나 늘림
        visitCount++;
        model.addAttribute("visits", visitCount);
        // View 이름
        return "hello-visit";
    }
}
