package com.hebr.shading.service;

import com.hebr.shading.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author Administrator
 * @class OrderService
 * @date 2021/4/3:1:19
 * @decs TODO
 */

public interface OrderService {

    boolean insert(Order o);


    List<Order> selectList();


    List<Order> selectById( int age,Long id);
}
