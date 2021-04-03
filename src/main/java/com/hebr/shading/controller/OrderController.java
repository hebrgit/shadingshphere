package com.hebr.shading.controller;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.IdcardUtil;
import cn.hutool.core.util.RandomUtil;
import com.hebr.shading.entity.Order;
import com.hebr.shading.entity.User;
import com.hebr.shading.mapper.OrderMapper;
import com.hebr.shading.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

/**
 * @author Administrator
 * @class OrderController
 * @date 2021/4/3:1:06
 * @decs TODO
 */
@RestController
public class OrderController {


    @Resource
    private OrderService orderService;


    @GetMapping("/save")
    public String save(){

        Order order = new Order();
        Snowflake snowflake = IdUtil.getSnowflake(1, 1);
        long id = snowflake.nextId();
        order.setId(id);
        order.setAge(RandomUtil.randomInt(0,80));
        order.setName(RandomUtil.randomStringUpper(2));
        boolean insert = orderService.insert(order);
        return "success";
    }

    @GetMapping("/select")
    public List<Order> select(){

      return  orderService.selectList();
    }

    @GetMapping("/selectById/{age}/{id}")
    public List<Order> selectById(@PathVariable("id") Long id,@PathVariable("age") int age){

        return  orderService.selectById(age,id);
    }
}
