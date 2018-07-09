package com.liming.seckillconcurrent.dao;

import com.liming.seckillconcurrent.domain.MiaoshaUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import static org.junit.Assert.*;

/**
 * @author liming
 * @date 2018/7/1   13:13
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MiaoshaUserDaoTest {

    @Autowired
    MiaoshaUserDao miaoshaUserDao;
    @Test
    public void getById() throws Exception {
       MiaoshaUser miaoshaUser = miaoshaUserDao.getById(15207114730l);
       System.out.println(miaoshaUser);
    }

}