package com.sparta.springmvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.springmvc.response.Star;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JacksonTest {

    @Test
    @DisplayName("Object To JSON : get Method 필요")
    void test1() throws JsonProcessingException {
        // 오버로딩된 생성자를 사용하여 하나의 객체를 만듦
        Star star = new Star("Robbie", 95);

        // object 형태에서 json 형태로 바꿈
        ObjectMapper objectMapper = new ObjectMapper(); // Jackson 라이브러리의 ObjectMapper
        // 변환하고 싶은 object의 객체를 넣어준다.(star)
        // String 타입의 JSON 형태로 만들어 준다.
        String json = objectMapper.writeValueAsString(star);

        // String이 찍혔는데 형태는 JSON
        System.out.println("json = " + json);
    }

    @Test
    @DisplayName("JSON To Object : 기본 생성자 & (get OR set) Method 필요")
    void test2() throws JsonProcessingException {
        String json = "{\"name\":\"Robbie\",\"age\":95}"; // JSON 타입의 String

        ObjectMapper objectMapper = new ObjectMapper(); // Jackson 라이브러리의 ObjectMapper

        Star star = objectMapper.readValue(json, Star.class); // Star 객체가 만들어 지게 됨
        System.out.println("star.getName() = " + star.getName());
        System.out.println("star.getAge() = " + star.getAge());
    }
}
