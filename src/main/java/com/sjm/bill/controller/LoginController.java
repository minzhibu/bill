package com.sjm.bill.controller;

import com.sjm.bill.common.CommonResult;
import com.sjm.bill.mbg.model.UserInformation;
import com.sjm.bill.server.LoginService;
import org.springframework.web.bind.annotation.*;

/**
 * 登陸
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/user")
    public CommonResult loginToUser(@RequestBody UserInformation userInformation){
        String token = loginService.LoginToUser(userInformation.getAccountNumber(), userInformation.getPassword());
        if(token == null){
            return CommonResult.unauthorized(null);
        }else{
            return CommonResult.success(token);
        }
    }
    @PostMapping("/token")
    public CommonResult loginToToken(@RequestHeader("Authorization") String authorization){
        UserInformation userInformation = loginService.LoginToToken(authorization);
        if(userInformation == null){
            return CommonResult.unauthorized(null);
        }else{
            return CommonResult.success(userInformation);
        }
    }
}
