package com.liming.seckillconcurrent.service;

import com.liming.seckillconcurrent.vo.LoginVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.http.HttpServletResponse;

import static org.junit.Assert.*;

/**
 * @author liming
 * @date 2018/7/2   14:40
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MiaoshaUserServiceTest {

    @Autowired
    MiaoshaUserService miaoshaUserService;
    @Test
    public void login(HttpServletResponse response) throws Exception {
        LoginVo loginVo = new LoginVo();
        loginVo.setMobile("15207114730");
        loginVo.setPassword("d3b1294a61a07da9b49b6e22b2cbd7f9");
        miaoshaUserService.login(response,loginVo);
    }

}