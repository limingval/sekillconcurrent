package com.liming.seckillconcurrent.dao;

import com.liming.seckillconcurrent.vo.GoodsVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author liming
 * @date 2018/7/2   20:36
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class GoodsDaoTest {

    @Autowired
    GoodsDao dao;

    @Test
    public void listGoodsVo() throws Exception {
        List<GoodsVo> list = dao.listGoodsVo();
        System.out.println(list.size());
        for (GoodsVo goodsVo : list) {
            System.out.println(goodsVo.toString());
        }
    }

}