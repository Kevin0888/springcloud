package com.ght.eurekafeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author GHT
 * @create 2020/8/18
 * @since 1.0.0
 */
//@FeignClient("compute-service")
//public interface ComputerClient {
//    @RequestMapping(method = RequestMethod.GET, value = "/add")
//    Integer add(@RequestParam(value = "a") Integer a ,@RequestParam(value = "b") Integer b);
//}
@FeignClient(value = "compute-service", fallback = ComputeClientHystrix.class)
public interface ComputerClient {
    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
