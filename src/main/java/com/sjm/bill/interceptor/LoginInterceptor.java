package com.sjm.bill.interceptor;

import com.alibaba.fastjson.JSON;
import com.sjm.bill.common.CommonResult;
import com.sjm.bill.mbg.model.UserInformation;
import com.sjm.bill.server.LoginService;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginInterceptor implements HandlerInterceptor {

    private final LoginService loginService;

    public LoginInterceptor(LoginService loginService) {
        this.loginService = loginService;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String authorization = request.getHeader("Authorization");
        if(authorization == null){
            this.resUnauthorized(response);
            return false;
        }else{
            UserInformation userInformation = loginService.LoginToToken(authorization);
            if(userInformation == null){
                resUnauthorized(response);
            }
            return userInformation != null;
        }
    }

    private void resUnauthorized(HttpServletResponse response) throws Exception{
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=utf-8");
        String json = JSON.toJSONString(CommonResult.unauthorized(null));
        response.getWriter().print(json);
    }

}
