package com.sparta.springmvc.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/response")
public class ResponseController {
    // Content-Type : text/html
    // Response Body
    // {"name":"Robbie", "age":95}
    // HTTP Response를 통해서 클라이언트로 반환된다.
    @GetMapping("/json/string")
    @ResponseBody
    public String helloStringJson() {
        return "{\"name\":\"Robbie\",\"age\":95}";
    }

    // Content-Type : application/json
    // Response Body
    // {"name":"Robbie","age":95}
    @GetMapping("/json/class")
    // @ResponseBody : 데이터를 반환하는 방법
    @ResponseBody
    public Star HelloClassJson() {
        // 객체를 생성하면서 반환
        // api 요청 받는 메서드
        return new Star("Robbi",95);
    }
}

