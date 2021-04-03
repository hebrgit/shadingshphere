package com.hebr.shading.mapper;

import com.hebr.shading.entity.Order;
import com.hebr.shading.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Administrator
 * @class OrderMapper
 * @date 2021/4/3:1:03
 * @decs TODO
 */
@Mapper

public interface OrderMapper {


    boolean insert(@Param("o") Order o);

    boolean insert1(@Param("u") User u);

    List<Order> selectList();

    @Select("select * from order where id = #{id} and age = #{age}")
    List<Order> selectByAge(@Param("age") int age,@Param("id") Long id);
}
