package com.example.springbootdeveloper;

import com.example.springbootdeveloper.springbootdeveloper.Member;
import com.example.springbootdeveloper.springbootdeveloper.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    TestService testService;

    @GetMapping("/test")
    public List<Member> getAllMembers() {
        List<Member> members = testService.getAllmembers();

        return members;
    }
}