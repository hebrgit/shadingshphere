package com.hebr.shading.service;

import com.hebr.shading.entity.Order;
import com.hebr.shading.mapper.OrderMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 * @class OrderServiceImpl
 * @date 2021/4/3:1:20
 * @decs TODO
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;
    @Override
    public boolean insert(Order o) {
        return orderMapper.insert(o);
//        return true;
    }

    @Override
    public List<Order> selectList() {
        return orderMapper.selectList();
//        return null;
    }

    @Override
    public List<Order> selectById(int age, Long id) {
        return orderMapper.selectByAge(age,id);
    }
}
