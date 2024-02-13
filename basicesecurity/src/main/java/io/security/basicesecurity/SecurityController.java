package io.security.basicesecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/")
    public String index(){
        return "home";
    }

    @GetMapping("login")
    public String loginPage(){
        return "login"; // 현재는 문자열이지만 로그인 페이지를 커스텀 하면 됨.
    }
}
