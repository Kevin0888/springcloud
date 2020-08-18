/**
 * Copyright (C), 2018-2020, xxx有限公司
 * FileName: ComputerController
 * Author:   GHT
 * Date:     2020/8/17 16:46
 * Description:
 * Version: V1.0
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.ght.servicetest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author GHT
 * @create 2020/8/17
 * @since 1.0.0
 */
public class ComputerController {
    private final Logger logger = Logger.getLogger(getClass());
    @Autowired
    private DiscoveryClient client;
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a ,@RequestParam Integer b){
        ServiceInstance instance = client.getLocalServiceInstance();
        Integer r = a+b;
        logger.info("/add,host:" + instance.getHost() +", service_id:"+ instance.getServiceId());
        return r;
    }
}
