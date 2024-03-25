package com.tgb.esayspring.designPattern.creational;

/**
 * @title: springboot-essay
 * @description: double check
 * @author: 北京小桔汇金网络科技有限公司
 * @date: 2023/03/07 18:05
 */
public class Singleton4 {
    private static volatile Singleton4 instance;

    private Singleton4() {
    }
    public static Singleton4 getInstance(){
        if (instance == null){
            synchronized (Singleton4.class){
                if (instance == null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
