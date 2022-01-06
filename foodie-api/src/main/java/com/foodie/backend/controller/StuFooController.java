package com.foodie.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import com.foodie.backend.service.StuService;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by Henry
 * 测试项目正常跑起来
 */

//@Controller
@ApiIgnore
@RestController
public class StuFooController {

    @Autowired
    private StuService stuService;


    @GetMapping("/getStu")
    public Object getStu(int id) {
        return stuService.getStuInfo(id);
    }

    @PostMapping("/saveStu")
    public Object saveStu() {
        stuService.saveStu();
        return "OK";
    }

    @PutMapping("/updateStu")
    public Object updateStu(int id) {
        stuService.updateStu(id);
        return "OK";
    }

    @DeleteMapping("/deleteStu")
    public Object deleteStu(int id) {
        stuService.deleteStu(id);
        return "OK";
    }

}
