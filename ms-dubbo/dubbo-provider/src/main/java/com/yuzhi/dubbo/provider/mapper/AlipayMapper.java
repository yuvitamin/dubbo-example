package com.yuzhi.dubbo.provider.mapper;

import com.yuzhi.dubbo.api.AlipayDto;
import com.yuzhi.dubbo.provider.domain.entity.Alipay;

/**
 * @author yuzhi
 */
public interface AlipayMapper {
    int deleteByPrimaryKey(Integer aId);

    int insert(Alipay record);

    int insertSelective(Alipay record);

    Alipay selectByPrimaryKey(Integer aId);

    int updateByPrimaryKeySelective(Alipay record);

    int updateByPrimaryKey(Alipay record);

    AlipayDto selectByOId(int oid);
}