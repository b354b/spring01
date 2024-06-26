package com.example.springbootdeveloper.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    MemberRepository memberRepository;

    public List<Member> getAllmembers() {
        return memberRepository.findAll();
    }
}
