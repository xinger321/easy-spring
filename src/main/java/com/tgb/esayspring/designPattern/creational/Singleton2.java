package com.tgb.esayspring.designPattern.creational;

/**
 * @title: springboot-essay
 * @description: 饿汉-线程安全-但是没有解约资源，没有延迟实例化
 * @author: 北京小桔汇金网络科技有限公司
 * @date: 2023/03/07 15:32
 */
public class Singleton2 {
    public static Singleton2 instance = new Singleton2();
    
}
