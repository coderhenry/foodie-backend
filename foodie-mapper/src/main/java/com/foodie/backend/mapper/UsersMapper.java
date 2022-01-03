package com.foodie.backend.mapper;

import com.foodie.backend.my.mapper.MyMapper;
import com.foodie.backend.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UsersMapper extends MyMapper<Users> {
}