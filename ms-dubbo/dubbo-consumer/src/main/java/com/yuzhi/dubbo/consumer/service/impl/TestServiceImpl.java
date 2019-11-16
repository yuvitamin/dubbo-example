package com.yuzhi.dubbo.consumer.service.impl;

import com.yuzhi.dubbo.api.AlipayService;
import com.yuzhi.dubbo.consumer.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import com.yuzhi.dubbo.api.AlipayDto;

/**
 * @author yuzhi
 */
@Service
public class TestServiceImpl implements TestService {
    //注入公共api接口
    @Reference
    AlipayService alipayService;
    @Override
    public AlipayDto findByOid(int oid) {
        AlipayDto alipayData = alipayService.getAlipayData(oid);
        return alipayData;
    }
}
