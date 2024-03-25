package com.tgb.esayspring.designPattern.creational;

/**
 * @title: springboot-essay
 * @description: 懒汉-延迟-线程不安全
 * @author: 北京小桔汇金网络科技有限公司
 * @date: 2023/03/07 15:31
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {
    }

    public static Singleton1 GetInstance(){
        if (instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
}
