/**
 * Copyright (C), 2018-2020, xxx有限公司
 * FileName: ComputeClientHystrix
 * Author:   GHT
 * Date:     2020/8/18 10:42
 * Description:
 * Version: V1.0
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.ght.eurekafeign.service;

import com.ght.eurekafeign.service.ComputerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author GHT
 * @create 2020/8/18
 * @since 1.0.0
 */
@Component
public class ComputeClientHystrix implements ComputerClient {
    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }
}
