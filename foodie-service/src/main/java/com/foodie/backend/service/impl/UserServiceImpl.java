package com.foodie.backend.service.impl;

import com.foodie.backend.enums.Sex;
import com.foodie.backend.mapper.UsersMapper;
import com.foodie.backend.pojo.Users;
import com.foodie.backend.pojo.bo.UserBO;
import com.foodie.backend.service.UserService;
import com.foodie.backend.utils.DateUtil;
import com.foodie.backend.utils.MD5Utils;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;

/**
 * Created by Henry
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private Sid sid;    //用于创建全局唯一id

    private static final String USER_FACE = "http://122.152.205.72:88/group1/M00/00/05/CpoxxFw_8_qAIlFXAAAcIhVPdSg994.png";

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public boolean queryUsernameIsExist(String username) {

        Example userExample = new Example(Users.class);
        Example.Criteria userCriteria = userExample.createCriteria();

        userCriteria.andEqualTo("username", username);

        Users result = usersMapper.selectOneByExample(userExample);
        return result == null ? false : true;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public Users createUser(UserBO userBO) {

        //测试日志级别，不同响应时间报不同级别日志
//        try {
//            Thread.sleep(3500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        String userId = sid.nextShort();

        Users user = new Users();
        user.setId(userId);
        user.setUsername(userBO.getUsername());
        try {
            user.setPassword(MD5Utils.getMD5Str(userBO.getPassword()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        //默认用户昵称同用户名一致
        user.setNickname(userBO.getUsername());
        //默认头像
        user.setFace(USER_FACE);
        //默认生日
        user.setBirthday(DateUtil.stringToDate("1990-01-01"));
        //默认性别-保密
        user.setSex(Sex.secret.type);
        //默认时间-当前时间
        user.setCreatedTime(new Date());
        user.setUpdatedTime(new Date());

        usersMapper.insert(user);

        return user;
    }

//    @Transactional(propagation = Propagation.SUPPORTS)
//    @Override
//    public Users queryUserForLogin(String username, String password) {
//
//        //测试日志级别，不同响应时间报不同级别日志
////        try {
////            Thread.sleep(2500);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//
//        Example userExample = new Example(Users.class);
//        Example.Criteria userCriteria = userExample.createCriteria();
//
//        userCriteria.andEqualTo("username", username);
//        userCriteria.andEqualTo("password", password);
//
//        Users result = usersMapper.selectOneByExample(userExample);
//
//        return result;
//    }
}
