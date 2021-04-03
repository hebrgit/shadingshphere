package com.hebr.shading.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 * @class Order
 * @date 2021/4/3:1:02
 * @decs TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Long id;

    private String name;

    private int age;
}
