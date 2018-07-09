package com.liming.seckillconcurrent.dao;

import com.liming.seckillconcurrent.domain.OrderInfo;
import com.liming.seckillconcurrent.vo.GoodsVo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @author liming
 * @date 2018/7/4   21:10
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderDaoTest {

    @Autowired
    OrderDao orderDao;
    @Autowired
    GoodsDao goodsDao;
    @Test
    public void insert() throws Exception {
        //			+ "#{userId}, #{goodsId}, #{goodsName}, #{goodsCount}, #{goodsPrice}, #{orderChannel},#{status},#{createDate}
        GoodsVo goodsVo = goodsDao.getGoodsVoByGoodsId(1l);

        OrderInfo ordaoInfo = new OrderInfo();
        ordaoInfo.setUserId(15207114730l);
        ordaoInfo.setGoodsId(1l);
        ordaoInfo.setGoodsName(goodsVo.getGoodsName());
        ordaoInfo.setGoodsCount(1);
        ordaoInfo.setGoodsPrice(goodsVo.getMiaoshaPrice());
        ordaoInfo.setOrderChannel(1);
        ordaoInfo.setStatus(0);
        ordaoInfo.setCreateDate(new Date());
        long res = orderDao.insert(ordaoInfo);
        Assert.assertEquals(res,1);
    }

}