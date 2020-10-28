package com.sjm.bill.server;

import com.sjm.bill.mbg.model.UserInformation;

public interface LoginService {
    /**
     *
     * @param accountNumber 账户
     * @param password 密码
     * @return
     */
    String LoginToUser(String accountNumber,String password);

    /**
     *
     * @param authorization
     * @return
     */
    UserInformation LoginToToken(String authorization);
}
