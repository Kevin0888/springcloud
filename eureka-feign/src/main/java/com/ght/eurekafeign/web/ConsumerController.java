/**
 * Copyright (C), 2018-2020, xxx有限公司
 * FileName: ConsumerController
 * Author:   GHT
 * Date:     2020/8/18 9:51
 * Description:
 * Version: V1.0
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.ght.eurekafeign.web;

import com.ght.eurekafeign.service.ComputerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author GHT
 * @create 2020/8/18
 * @since 1.0.0
 */
@RestController
public class ConsumerController {
    @Autowired
    ComputerClient computerClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return computerClient.add(10, 20);
    }
}
