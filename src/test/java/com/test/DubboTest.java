/**
 * Copyright (c) Windliven 2016 All Rights Reserved
 *
 * @author liyj
 * @date 2017年7月10日 上午10:44:09
 * @since V1.0.0
 */
package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO
 *
 * @author liyj
 * @date 2017年7月10日 上午10:44:09
 *
 */
public class DubboTest {
    
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo-provider.xml");
        context.start();
        System.out.println("服务启动成功！！！" + context.getBean("testService"));
        while(true) {
            
        }
    }
    
}
