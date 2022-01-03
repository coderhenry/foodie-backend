package com.foodie.backend.mapper;

import com.foodie.backend.my.mapper.MyMapper;
import com.foodie.backend.pojo.ItemsParam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ItemsParamMapper extends MyMapper<ItemsParam> {
}