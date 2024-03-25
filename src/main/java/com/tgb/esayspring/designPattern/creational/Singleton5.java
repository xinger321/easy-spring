package com.tgb.esayspring.designPattern.creational;

/**
 * @title: springboot-essay
 * @description: 静态内部类-延迟实例化-jvm保证只加载一次
 * @author: 北京小桔汇金网络科技有限公司
 * @date: 2023/03/07 18:30
 */
public class Singleton5 {
    private Singleton5(){
        
    }
    private static class SingletonHolder {
        private static final Singleton5 instance = new Singleton5();
    }
    public static Singleton5 getInstance(){
        return SingletonHolder.instance;
    }
}
