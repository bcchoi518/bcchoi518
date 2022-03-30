package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")    // 웹 어플리케이션에서 /hello로 들어오면 메서드를 실행해줌
    public String hello(Model model) {  // spring이 model이란것을 만들어서 넣어줌
        model.addAttribute("data", "hello!!");  // key: "data", value: "hello!!"
        return "hello"; // return의 이름이 hello로 반환하면 main/resources/templates/hello.html을 실행시킴 (Thymeleaf 템플릿 엔진 처리)
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        // RequestParam : 외부에서 파라미터를 받음
        model.addAttribute("name", name);
        // http://localhost:8080/hello-mvc?name=sping!!!!!
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody   // http의 Body부에 직접 return 내용을 넣어주겠다.
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name; //"hello spring" 가 그대로 출력된다.
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;   // return에 객체가 오면 json형식으로 반환하는것이 디폴트
    }

    static class Hello{
        private  String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
// Controller에서 리턴 값으로 문자를 반환하면 뷰 리졸버(viewResolver)가 화면을 찾아서 처리한다.
// - 스프링 부트 템플릿엔진 기본 viewName 매핑
// - `resources:templates/` + (ViewName) + `.html`