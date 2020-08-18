/**
 * Copyright (C), 2018-2020, xxx有限公司
 * FileName: ConsumerCotroller
 * Author:   GHT
 * Date:     2020/8/17 17:51
 * Description:
 * Version: V1.0
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.ght.eurekaribbon.web;

import com.ght.eurekaribbon.service.ComputeService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author GHT
 * @create 2020/8/17
 * @since 1.0.0
 */
@RestController
public class ConsumerCotroller {
//    @Autowired
//    RestTemplate restTemplate;
//
//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public String add(){
//        return restTemplate.getForEntity("http://compute-service/add?a=10&b=20", String.class).getBody();
//    }
    private ComputeService computeService;
@RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){
        return computeService.addService();
    }
}
