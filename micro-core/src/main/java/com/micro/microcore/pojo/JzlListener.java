package com.micro.microcore.pojo;

import com.micro.microcore.service.JzlService;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author: jzl
 * @Description:
 * @Date: Created in 15:40 2020/1/8
 * @Modified By:
 */
@Order
@Component
public class JzlListener {

    private final JzlService jzlService;


    public JzlListener(JzlService jzlService) {
        this.jzlService = jzlService;
    }
}
