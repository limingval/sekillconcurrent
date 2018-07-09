package com.liming.seckillconcurrent.controller;

import com.liming.seckillconcurrent.domain.User;
import com.liming.seckillconcurrent.redis.RedisService;
import com.liming.seckillconcurrent.result.Result;
import com.liming.seckillconcurrent.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author liming
 * @date 2018/6/29   16:16
 */
@RestController
@RequestMapping("/test")
@EnableSwagger2//配置生成swagger
public class HelloController {

    @Autowired
    UserService userService;

    @Autowired
    RedisService redisService;

    @GetMapping("/liming")
    @ApiOperation("测试方法")
    public String test(Model model) {
        model.addAttribute("name", "liming");
        return "hello";
    }

    @GetMapping("/getUser")
    public Result<User> getUserById(Integer id) {
        User user = userService.getById(1);
        System.out.println(user);
        return Result.success(user);
    }

    /*@GetMapping("/set")
    public Result<User> setRedis(Integer id) {
        redisService.set("test","name","hello");


    }*/
}
