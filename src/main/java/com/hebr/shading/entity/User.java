package com.hebr.shading.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Administrator
 * @class Order
 * @date 2021/4/3:1:02
 * @decs TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;

    private String name;

    private int age;

    private String yearmonth;
}
