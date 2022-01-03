package com.foodie.backend.mapper;

import com.foodie.backend.my.mapper.MyMapper;
import com.foodie.backend.pojo.Carousel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface CarouselMapper extends MyMapper<Carousel> {
}