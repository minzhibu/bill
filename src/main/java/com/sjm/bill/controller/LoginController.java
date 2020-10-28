package com.sjm.bill.controller;

import com.sjm.bill.common.CommonResult;
import com.sjm.bill.server.LoginService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/login")
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/user")
    public CommonResult loginToUser(@RequestParam("accountNumber")String accountNumber,@RequestParam("password") String password){
        String token = loginService.LoginToUser(accountNumber, password);
        if(token == null){
            return CommonResult.unauthorized(null);
        }else{
            return CommonResult.success(token);
        }
    }
}
