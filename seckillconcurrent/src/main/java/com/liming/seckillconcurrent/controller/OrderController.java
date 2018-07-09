package com.liming.seckillconcurrent.controller;

import com.liming.seckillconcurrent.domain.MiaoshaUser;
import com.liming.seckillconcurrent.domain.OrderInfo;
import com.liming.seckillconcurrent.redis.RedisService;
import com.liming.seckillconcurrent.result.CodeMsg;
import com.liming.seckillconcurrent.result.Result;
import com.liming.seckillconcurrent.service.GoodsService;
import com.liming.seckillconcurrent.service.MiaoshaUserService;
import com.liming.seckillconcurrent.service.OrderService;
import com.liming.seckillconcurrent.vo.GoodsVo;
import com.liming.seckillconcurrent.vo.OrderDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired
	MiaoshaUserService userService;
	
	@Autowired
	RedisService redisService;
	
	@Autowired
	OrderService orderService;
	
	@Autowired
	GoodsService goodsService;
	
    @RequestMapping("/detail")
    @ResponseBody
    public Result<OrderDetailVo> info(Model model, MiaoshaUser user,
									  @RequestParam("orderId") long orderId) {
    	if(user == null) {
    		return Result.error(CodeMsg.SESSION_ERROR);
    	}
    	OrderInfo order = orderService.getOrderById(orderId);
    	if(order == null) {
    		return Result.error(CodeMsg.ORDER_NOT_EXIST);
    	}
    	long goodsId = order.getGoodsId();
    	GoodsVo goods = goodsService.getGoodsVoByGoodsId(goodsId);
    	OrderDetailVo vo = new OrderDetailVo();
    	vo.setOrder(order);
    	vo.setGoods(goods);
    	return Result.success(vo);
    }
    
}
