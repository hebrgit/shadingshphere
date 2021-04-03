package com.hebr.shading;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;
import com.hebr.shading.entity.User;
import com.hebr.shading.mapper.OrderMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ShadingApplicationTests {
    @Resource
    private OrderMapper orderMapper;
    @Test
    void contextLoads() {

        User order = new User();
        Snowflake snowflake = IdUtil.getSnowflake(1, 1);
        long id = snowflake.nextId();
        order.setId(id);
        order.setAge(RandomUtil.randomInt(0,80));
        order.setName(RandomUtil.randomStringUpper(2));
        order.setYearmonth("202103");
        orderMapper.insert1(order);


        List<String> strings = new ArrayList<>();


    }

}
