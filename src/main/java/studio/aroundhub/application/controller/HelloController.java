package studio.aroundhub.application.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class HelloController {

    //private final Logger logger = LoggerFactory.getLogger("PostController");
    //이 방식도 있지만 어노테이션 방식을 이용하면 더 간단하게 가능 @Slf4j
    @GetMapping("hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name){
        log.info("hello method");
        //logger.info("hello method");
        return String.format("Hello %s", name);
    }

    @GetMapping("/hello/{text}")
    public String hello2(@PathVariable String text){
        log.info(text);
        log.info("input data {}", text);
        //logger.info(text);
        //logger.info("input data : {}", text);
        //logger.info("input data : {} , {}", "text = ", text);
        return "hello";
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
