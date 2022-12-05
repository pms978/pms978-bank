package studio.aroundhub.application.입출금.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import studio.aroundhub.application.입출금.dto.AccountDTO;

import java.util.Map;
@Slf4j
@RestController
@RequestMapping("/bank-api")
public class withdrawController {

    @PutMapping(value = "/withdraw")
    public String withdrawAccountdto(@RequestBody AccountDTO accountDTO) {

        log.info(accountDTO.getName());
        log.info(String.valueOf(accountDTO.getAmount()));
        log.info(String.valueOf(accountDTO.getAccountNumber()));

        String result = accountDTO.getName() + "님께서 " + accountDTO.getAmount() +"원을 "
                + "출금하셨습니다.";

        return result;
        //json 형식 body return
    }
}
