/**
 * Copyright (C), 2018-2020, xxx有限公司
 * FileName: TestController
 * Author:   GHT
 * Date:     2020/8/18 16:03
 * Description:
 * Version: V1.0
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.ght.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author GHT
 * @create 2020/8/18
 * @since 1.0.0
 */
@RefreshScope
@RestController
public class TestController {
    @Value("${from}")
    private String from;
    @RequestMapping("/from")
    public String from(){
        return this.from;
    }
    public void setFrom(String from) {
        this.from = from;
    }

    public String getFrom() {
        return from;
    }
}
