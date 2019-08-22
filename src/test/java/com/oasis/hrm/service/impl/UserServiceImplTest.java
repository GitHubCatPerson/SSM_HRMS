package com.oasis.hrm.service.impl;

import com.oasis.hrm.dao.UserDao;
import com.oasis.hrm.service.iservice.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserServiceImplTest {
    @Autowired
    UserService userService;
    @Test
    public void userExist() {
        System.err.println("&&&&&&&&&&&&&&&&&&&&&&"+userService.userExist("wang"));

    }

    @Test
    public void login() {
        System.err.println("$$$$$$$$$$$$$$$$$$$$$$"+userService.login("wang","888"));
    }

    @Test
    public void registerCheck() {

        System.err.println("$$$$$$$$$$$$$$$"+userService.registerCheck("wang","username"));
        System.err.println("$$$$$$$$$$$$$$$"+userService.registerCheck("wangd","username"));
        System.err.println("$$$$$$$$$$$$$$$"+userService.registerCheck("admin@emall.com","email"));
        System.err.println("$$$$$$$$$$$$$$$"+userService.registerCheck("wadmin@emall.com","email"));
    }

    @Test
    public void register() {
    }
}