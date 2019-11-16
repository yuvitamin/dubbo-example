package com.yuzhi.dubbo.consumer.service;

import com.yuzhi.dubbo.api.AlipayDto;

/**
 * @author yuzhi
 */
public interface TestService {

    AlipayDto findByOid(int oid);
}
