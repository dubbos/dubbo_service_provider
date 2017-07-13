/**
 * Copyright (c) Windliven 2016 All Rights Reserved
 *
 * @author liyj
 * @date 2017年7月10日 上午10:20:19
 * @since V1.0.0
 */
package com.dubbo.test.provider;

import com.dubbo.test.inter.service.TestService;

/**
 * TODO
 *
 * @author liyj
 * @date 2017年7月10日 上午10:20:19
 *
 */
public class TestServiceImpl implements TestService{

    /*
     * @see com.dubbo.test.inter.service.TestService#getName(java.lang.String)
     */
    public String getName(String name) {
        return "hello " + name + ", success!!";
    }
    
}
