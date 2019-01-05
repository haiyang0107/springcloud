package com.springcloud.client.base;

import com.springcloud.api.base.BaseDataApi;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "base-service")
public interface BaseDataClient extends BaseDataApi {

}
