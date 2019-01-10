package com.springcloud.api.base;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 接口api 用于集中api 管理
 */
@RequestMapping(value = "/api/base/baseInfo")
public interface BaseDataApi {

    @GetMapping(value= "testData")
    public String testData(String ss);
}
