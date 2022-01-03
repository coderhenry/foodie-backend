//package com.foodie.backend.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//
///**
// * 解决跨域
// */
//@Configuration
//public class CorsConfig {
//
//    public CorsConfig() {
//    }
//
//    @Bean
//    public CorsFilter corsFilter() {
//        // 1. 添加cors配置信息
//        CorsConfiguration com.foodie.backend.config = new CorsConfiguration();
//        com.foodie.backend.config.addAllowedOrigin("http://localhost:8080");
//        com.foodie.backend.config.addAllowedOrigin("http://shop.z.mukewang.com:8080");
//        com.foodie.backend.config.addAllowedOrigin("http://center.z.mukewang.com:8080");
//        com.foodie.backend.config.addAllowedOrigin("http://shop.z.mukewang.com");
//        com.foodie.backend.config.addAllowedOrigin("http://center.z.mukewang.com");
//        com.foodie.backend.config.addAllowedOrigin("*");
//
//        // 设置是否发送cookie信息
//        com.foodie.backend.config.setAllowCredentials(true);
//
//        // 设置允许请求的方式
//        com.foodie.backend.config.addAllowedMethod("*");
//
//        // 设置允许的header
//        com.foodie.backend.config.addAllowedHeader("*");
//
//        // 2. 为url添加映射路径
//        UrlBasedCorsConfigurationSource corsSource = new UrlBasedCorsConfigurationSource();
//        corsSource.registerCorsConfiguration("/**", com.foodie.backend.config);
//
//        // 3. 返回重新定义好的corsSource
//        return new CorsFilter(corsSource);
//    }
//
//}
