package com.david.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "SERVICE-EUREKA-CLIENT",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    /**
     * 将会调用SERVICE-EUREKA-CLIENT此 提供者的类方法
     */
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);


}
