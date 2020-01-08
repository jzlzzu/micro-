package com.micro.microcore.controller;

import com.micro.microcore.pojo.Student;
import com.micro.microcore.props.StuProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: jzl
 * @Description:
 * @Date: Created in 10:53 2019/12/26
 * @Modified By:
 */
@RestController
@RequestMapping("/nacos")
@RefreshScope
public class NacosController {


    @Value("${micro:1}")
    private String micro;

    @Value("${micro-dev:2}")
    private String microDev;

    @Value("${micro-prod:3}")
    private String microProd;

    @Autowired
    private StuProperties stuProperties;

    /**
     * 测试配置文件读取
     */
    @RequestMapping("/get")
    public String get() {

        System.out.println("micro = " + micro);
        System.out.println("microDev = " + microDev);
        System.out.println("microProd = " + microProd);

        return "ok";
    }

    @GetMapping("/stu")
    public void queryStuPro(){
        List<Student> students = stuProperties.getStuDents();
        System.out.println(students);
    }


}
