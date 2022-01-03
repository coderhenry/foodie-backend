package com.foodie.backend.service;

import com.foodie.backend.pojo.Stu;

/**
 * Created by Henry
 */
public interface StuService {

    //查
    public Stu getStuInfo(int id);

    //增
    public void saveStu();

    //改
    public void updateStu(int id);

    //删
    public void deleteStu(int id);

    public void saveParent();

    public void saveChildren();
}
