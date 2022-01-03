package com.foodie.backend.mapper;

import com.foodie.backend.my.mapper.MyMapper;
import com.foodie.backend.pojo.Items;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ItemsMapper extends MyMapper<Items> {
}