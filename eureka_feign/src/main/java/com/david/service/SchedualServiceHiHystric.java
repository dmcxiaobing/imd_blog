package com.david.service;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 解决服务路由问题
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    /**
     * 提供者服务异常则会调用此方法
     */
    @Override
    public String sayHiFromClientOne(@RequestParam(value = "name")String name) {
        return "sorry "+name;
    }


}
