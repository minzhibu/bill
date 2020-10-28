package com.sjm.bill.server.impl;

import com.alibaba.fastjson.JSON;
import com.sjm.bill.mbg.mapper.UserInformationMapper;
import com.sjm.bill.mbg.model.UserInformation;
import com.sjm.bill.server.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LoginServiceImpl implements LoginService {

    private final StringRedisTemplate stringRedisTemplate;
    private final UserInformationMapper userInformationMapper;

    public LoginServiceImpl(UserInformationMapper userInformationMapper, StringRedisTemplate stringRedisTemplate) {
        this.userInformationMapper = userInformationMapper;
        this.stringRedisTemplate = stringRedisTemplate;
    }

    @Override
    public String LoginToUser(String accountNumber,String password) {
        List<UserInformation> userInformations = userInformationMapper.selectByLogin(accountNumber, password);
        if(userInformations.size() == 1){
            String token = UUID.randomUUID().getMostSignificantBits() + "";
            stringRedisTemplate.opsForValue().set(token, JSON.toJSONString(userInformations.get(0)));
            return token;
        }
        return null;
    }

    @Override
    public UserInformation LoginToToken(String authorization) {
        String s = stringRedisTemplate.opsForValue().get(authorization);
        return JSON.parseObject(s, UserInformation.class);
    }
}
