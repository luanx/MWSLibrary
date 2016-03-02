package com.wantdo.common.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @ Date : 16/3/1
 * @ From : MWSLibrary
 * @ Author : luanx@wantdo.com
 */
public class ServiceUtils {

    private static ApplicationContext ac = new FileSystemXmlApplicationContext("classpath:conf/spring-*.xml");

    public static <T> T getService(Class<T> arg0){
        return ac.getBean(arg0);
    }

}
