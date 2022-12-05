package studio.aroundhub.application.controller;


import org.springframework.web.bind.annotation.*;
import studio.aroundhub.application.dto.MemberDTO;

import java.util.Map;

@RestController
@RequestMapping("/v1/get-api")
public class GetController {

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String getHello(){
        return "Hello World!";
    }
    // http://localhost:8080/v1/get-api/name
    @GetMapping(value = "/name")
    public String getName() {
        return "Falture";
    }
    // http://localhost:8080/v1/get-api/variable1/{String 값}
    @GetMapping(value = "/variable1/{variable}")
    public String getVariable1(@PathVariable String variable) {
        return variable;
    }

    // http://localhost:8080/v1/get-api/variable2/{String 값}
    // 파라미터 값을 일치시킬 수 없는 상황에 사용
    @GetMapping(value = "/variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String var) {
        return var;
    }

    // http://localhost:8080/request1?
    // name =
    // email =
    // organization =
    @GetMapping(value = "/request1")
    public String getRequestParam1(@RequestParam String name, @RequestParam String email, @RequestParam String organization){
        return name + " " + email + " " + organization;
    }

    //Map 활용
    @GetMapping(value = "/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param) {
        StringBuilder sb = new StringBuilder();

        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }


    //DTO 클래스 활용
    @GetMapping(value = "/request3")
    public String getRequestParam3(MemberDTO memberDTO){
        return memberDTO.toString();
    }

}
