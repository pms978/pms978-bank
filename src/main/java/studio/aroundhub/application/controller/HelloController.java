package studio.aroundhub.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name){
        return String.format("Hello %s", name);
    }

    @PostMapping("/v1/add")
    public String add(int mount){
        //입금하는 로직
        return "success";
    }

    @PostMapping("/v2/add") // 신규 서비스에서는 v2를 이용하도록 안내 (버저닝) // 위에서 RequestMapping("/v1")으로 경로 설정 가능
    public String add2(String amountType, int mount){
        //입금하는 로직
        return "success";
    }
}
