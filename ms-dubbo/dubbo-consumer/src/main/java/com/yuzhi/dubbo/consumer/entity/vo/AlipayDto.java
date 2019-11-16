package com.yuzhi.dubbo.consumer.entity.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yuzhi
 */
@Data
public class AlipayDto implements Serializable {
    private Integer aId;

    private String aCode;

    private Integer oId;
}