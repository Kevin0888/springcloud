/**
 * Copyright (C), 2018-2020, xxx有限公司
 * FileName: ComputeService
 * Author:   GHT
 * Date:     2020/8/18 10:16
 * Description:
 * Version: V1.0
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.ght.eurekaribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author GHT
 * @create 2020/8/18
 * @since 1.0.0
 */
@Service
public class ComputeService {
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String addService(){
        return restTemplate.getForEntity("http://compute-service/add?a=10&b=20",String.class).getBody();
    }
    public String addServiceFallback(){
        return "error";
    }
}
