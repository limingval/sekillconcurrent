package com.liming.seckillconcurrent.redis;

import com.liming.seckillconcurrent.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author liming
 * @date 2018/7/1   11:11
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisServiceTest {

    @Autowired
    RedisService redisService;
    @Test
    public void get() throws Exception {

       User user =  redisService.get(UserKey.getById,"id",User.class);
        Assert.assertEquals("liming",user.getName());
    }

    @Test
    public void set() throws Exception {
        User user = new User();
        user.setId(1);
        user.setName("liming");
        redisService.set(UserKey.getById,"id",user);

    }

}