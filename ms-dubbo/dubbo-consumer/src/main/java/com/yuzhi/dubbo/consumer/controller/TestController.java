package com.yuzhi.dubbo.consumer.controller;

import com.yuzhi.dubbo.consumer.service.TestService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yuzhi.dubbo.api.AlipayDto;

import javax.annotation.Resource;

/**
 * @author yuzhi
 */
@RestController
public class TestController {
    @Resource
    TestService testService;
    @RequestMapping("/test/{oid}")
    public AlipayDto findByOid(@PathVariable int oid){
        return testService.findByOid(oid);
    }
}
