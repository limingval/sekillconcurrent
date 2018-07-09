package com.liming.seckillconcurrent.service;

import com.liming.seckillconcurrent.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author liming
 * @date 2018/6/29   21:05
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService userService;
    @Test
    public void getById() throws Exception {
       User user = userService.getById(1);
       System.out.println(user);
    }

}