package com.oasis.hrm.service.iservice;

import com.oasis.hrm.commons.ResponseResult;
import com.oasis.hrm.dao.pojo.User;

public interface UserService {
    /**
     * 判断用户名存在
     * @param username
     * @return
     */
   ResponseResult userExist(String username);

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
   ResponseResult<User> login(String username,String password);

    /**
     * 注册
     * @param user
     * @return
     */
   ResponseResult<String> register(User user);

    /**
     * 注册的username  and  Email 校验
     * @param str
     * @param type
     * @return
     */
   ResponseResult<String> registerCheck(String str,String type);


}
