package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //HelloController 클래스가 컨트롤러의 기능을 수행함.
            //이 어노테이션이 있어야 프레임워크가 컨트롤러로 인식
public class HelloController {
    @GetMapping("/hello")   //http://localhost:8080/hello URL 요청이 발생하면 hello 메서드 실행
    @ResponseBody
    public String hello(){
        return "Hello Spring Boot Now~";
    }
}
