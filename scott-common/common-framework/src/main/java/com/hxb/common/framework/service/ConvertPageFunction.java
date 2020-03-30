package com.hxb.common.framework.service;

/**
 * @Author anyang
 * @CreateTime 2019/11/26
 * @Des
 */
@FunctionalInterface
public interface ConvertPageFunction<DO, DTO> {
    void convert(DO d, DTO dto);
}
