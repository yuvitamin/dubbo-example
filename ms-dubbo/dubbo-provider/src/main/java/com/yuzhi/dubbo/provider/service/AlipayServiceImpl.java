package com.yuzhi.dubbo.provider.service;

import com.yuzhi.dubbo.api.AlipayDto;
import com.yuzhi.dubbo.api.AlipayService;
import com.yuzhi.dubbo.provider.mapper.AlipayMapper;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

/**
 * @author yuzhi
 */
@Service
public class AlipayServiceImpl implements AlipayService {
    @Resource
    AlipayMapper alipayMapper;
    @Override
    public AlipayDto getAlipayData(int oid) {
        return alipayMapper.selectByOId(oid);
    }
}
