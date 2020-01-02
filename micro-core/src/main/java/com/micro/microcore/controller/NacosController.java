package com.micro.microcore.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


    @Value("${useLocalCache:false}")
    private String useLocalCache;

    @Value("${useLocalCache1:false}")
    private String useLocalCache1;

    @Value("${useLocalCache2:false}")
    private String useLocalCache2;

    @RequestMapping("/get")
    public String get() {
        return useLocalCache;
    }

    @RequestMapping("/get1")
    public String get1() {
        return useLocalCache1;
    }

    @RequestMapping("/get2")
    public String get2() {
        return useLocalCache2;
    }

}
