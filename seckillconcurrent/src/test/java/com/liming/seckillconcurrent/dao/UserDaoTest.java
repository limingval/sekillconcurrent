package com.liming.seckillconcurrent.dao;

import com.liming.seckillconcurrent.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author liming
 * @date 2018/6/29   21:03
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    UserDao userDao;//这里报错没关系
    @Test
    public void getById() throws Exception {
       User  user = userDao.getById(1);
       System.out.println(user);
    }

}