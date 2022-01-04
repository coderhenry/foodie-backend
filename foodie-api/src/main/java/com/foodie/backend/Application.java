package com.foodie.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Created by Henry
 */

@SpringBootApplication
//扫描 mybatis 通用 mapper 所在的包
@MapperScan(basePackages = "com.foodie.backend.mapper")
//扫描所有包以及相关组件包
@ComponentScan(basePackages = {"com.foodie.backend", "org.n3r.idworker"})   //用来扫描idworker，创建全局唯一性id
//@EnableTransactionManagement 可加可不加，原因是在@SpringBootApplication中已经自动装配了
public class Application {

    public static void main(String[] args) {
        try {
            SpringApplication.run(Application.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
