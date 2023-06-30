package dev.be.moduleapi.controller;

import dev.be.moduleapi.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final DemoService demoService; // final 로 선언하면 @RequiredArgsConstructor 이 의존성 주입(생성자)을 하여 줌

    @GetMapping("/save")
    public String save() {
        return demoService.save();
    }

    @GetMapping("/find")
    public String find() {
        return demoService.find();
    }

    @GetMapping("/exception")
    public String exception() {
        return demoService.exception();
    }
}
